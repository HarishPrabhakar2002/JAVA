package com.specification.filtration.Controller;

import com.specification.filtration.Entity.filter;
import com.specification.filtration.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/all")
public class control {

    @Autowired
    private service se;

    @GetMapping("/get")
        public List<filter>gettingall(){
        return se.getAllData();
    }
    @PostMapping("/post")
    public filter creatingone(@RequestBody  filter src){
        return se.createData(src);
    }

    @GetMapping
    public List<filter> findingthecriteria(
            @RequestParam(required = false)String name,
            @RequestParam(required = false)Double price,
            @RequestParam(required = false)String dept)
    {
        return  se.FindByCriteria(name,price,dept);
    }

    }


