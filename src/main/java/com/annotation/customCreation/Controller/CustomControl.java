package com.annotation.customCreation.Controller;

import com.annotation.customCreation.Entity.TableEntity;
import com.annotation.customCreation.Service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class CustomControl {
    @Autowired
    private CustomService service;

    @GetMapping("/get")
    public List<TableEntity>list(){
        return service.entityList();
    }
    @GetMapping("/nam")
    public List<TableEntity>listByName(@RequestParam String name){
        return service.table(name);
    }


    @PostMapping("/post")
    public TableEntity table(@RequestBody TableEntity entity){
        return service.tables(entity);
    }

}
