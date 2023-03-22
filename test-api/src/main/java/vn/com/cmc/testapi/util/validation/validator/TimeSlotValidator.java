package vn.com.cmc.testapi.util.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;
import vn.com.cmc.testapi.util.constant.CharConst;
import vn.com.cmc.testapi.util.constant.ValidateConst;
import vn.com.cmc.testapi.util.validation.LicensePlateValidation;
import vn.com.cmc.testapi.util.validation.TimeSlotValidation;

public class TimeSlotValidator implements ConstraintValidator<TimeSlotValidation, String> {

    @Override
    public void initialize(TimeSlotValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(String time, ConstraintValidatorContext constraintValidatorContext) {
        if (!time.trim().matches(ValidateConst.TIME_SLOT_CONST)) {
            return false;
        }

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        if (hour < 0 || hour > 23) {
            return false;
        }

        return minute >= 0 && minute <= 59;
    }
}
