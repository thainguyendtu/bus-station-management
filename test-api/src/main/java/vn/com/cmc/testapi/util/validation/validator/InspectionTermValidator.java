package vn.com.cmc.testapi.util.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import vn.com.cmc.testapi.util.constant.ValidateConst;
import vn.com.cmc.testapi.util.validation.InspectionTermValidation;
import vn.com.cmc.testapi.util.validation.TimeSlotValidation;

import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class InspectionTermValidator implements ConstraintValidator<InspectionTermValidation, Date> {

    @Override
    public void initialize(InspectionTermValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(Date inspectionTerm, ConstraintValidatorContext constraintValidatorContext) {
        Date dateNow = new Date(System.currentTimeMillis());
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(dateNow);
        int currentMonth = calNow.get(Calendar.MONTH);

        Calendar calInspectTerm = Calendar.getInstance();
        calInspectTerm.setTime(inspectionTerm);
        int inspectionTermMonth = calInspectTerm.get(Calendar.MONTH);

        return inspectionTermMonth - currentMonth >= 1;
    }
}
