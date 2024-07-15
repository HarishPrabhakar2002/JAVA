package com.annotation.customCreation.Validation;

import com.annotation.customCreation.Entity.TableEntity;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = DeptValidator.class)

public @interface CustomValidation {
    public String message()default "Invalid dept";
    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {};
}
