package com.annotation.customCreation.Validation;


import com.annotation.customCreation.Exe.notvaliddept;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class DeptValidator implements ConstraintValidator<CustomValidation,String> {
    @Override
    public boolean isValid(String deptType, ConstraintValidatorContext constraintValidatorContext) {
        List<String>list= Arrays.asList("IT","mech","civil");
        if(!list.contains(deptType)){
            throw new notvaliddept("contact owner");
        }
        return list.contains(deptType);
    }
}
