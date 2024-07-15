package com.annotation.customCreation.Validation;

import com.annotation.customCreation.Exception.invalidException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class validator implements ConstraintValidator<Empvalid,String> {

    @Override
    public boolean isValid(String emp, ConstraintValidatorContext constraintValidatorContext) {
        List<String>list= Arrays.asList("permanent","vendor","interviewer");
    if(!list.contains(emp))
    {
    throw new invalidException("invalid employee");
    }


        return list.contains(emp);
    }
}
