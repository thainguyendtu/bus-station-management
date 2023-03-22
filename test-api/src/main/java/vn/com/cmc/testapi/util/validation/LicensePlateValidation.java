package vn.com.cmc.testapi.util.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import vn.com.cmc.testapi.util.validation.validator.LicensePlateValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = LicensePlateValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LicensePlateValidation {

    String message() default "Invalid license plate";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
