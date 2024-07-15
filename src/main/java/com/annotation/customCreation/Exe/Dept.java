package com.annotation.customCreation.Exe;

import com.annotation.customCreation.Exception.invalidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class Dept {
    @ExceptionHandler(notvaliddept.class)
    public ResponseEntity<String>responseEntity(notvaliddept notvaliddept)
    {
        return new ResponseEntity<>(notvaliddept.getMessage(), HttpStatus.BAD_REQUEST);
    }}
