package com.annotation.customCreation.Validation;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = validator.class)
public @interface Empvalid {
    public String message()default "invalid Employee";
    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {};
}
