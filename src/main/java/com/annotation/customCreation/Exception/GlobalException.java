package com.annotation.customCreation.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(invalidException.class)


public ResponseEntity<String>excep(invalidException invalid){
        return new ResponseEntity<>(invalid.getMessage(),HttpStatus.BAD_REQUEST);

    }
}
