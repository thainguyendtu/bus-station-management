package vn.com.cmc.testapi.util.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import vn.com.cmc.testapi.util.validation.validator.InspectionTermValidator;
import vn.com.cmc.testapi.util.validation.validator.TimeSlotValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = InspectionTermValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InspectionTermValidation {

    String message() default "Invalid inspection term";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
