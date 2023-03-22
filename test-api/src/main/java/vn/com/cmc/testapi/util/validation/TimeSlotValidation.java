package vn.com.cmc.testapi.util.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import vn.com.cmc.testapi.util.validation.validator.TimeSlotValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TimeSlotValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeSlotValidation {

    String message() default "Invalid time slot";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
