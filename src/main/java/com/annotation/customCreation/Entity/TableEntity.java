package com.annotation.customCreation.Entity;

import com.annotation.customCreation.Validation.CustomValidation;
import com.annotation.customCreation.Validation.Empvalid;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "customAnnotation")
public class TableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    //custom annotation
    @CustomValidation
    private String dept;
    @Empvalid
    private String employee;

}
