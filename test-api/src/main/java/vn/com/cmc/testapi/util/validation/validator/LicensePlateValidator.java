package vn.com.cmc.testapi.util.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import vn.com.cmc.testapi.util.constant.ValidateConst;
import vn.com.cmc.testapi.util.validation.LicensePlateValidation;

public class LicensePlateValidator implements ConstraintValidator<LicensePlateValidation, String> {

    @Override
    public void initialize(LicensePlateValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(String licensePlateField, ConstraintValidatorContext constraintValidatorContext) {
        if (!licensePlateField.trim().matches(ValidateConst.LICENSE_PLATE_CONST)) {
            return false;
        }

        int provinceCode = Integer.parseInt(licensePlateField.substring(0, 2));
        return provinceCode > 10 && provinceCode != 80;

    }
}
