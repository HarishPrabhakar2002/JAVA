package com.email.emailapplication.Controller;

import com.email.emailapplication.Dto.emaildto;
import com.email.emailapplication.Dto.logindto;
import com.email.emailapplication.Enity.Registerpage;
import com.email.emailapplication.Service.emailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class mailcontroller {

    @Autowired
    private emailservice service;

    // GET METHOD
    @GetMapping("/get")
    public List<Registerpage>gettingAllValues(){

        return service.findAllData();
    }
    // POST METHOD
    @PostMapping("/post")
    public Registerpage resolvingdata(@RequestBody Registerpage values){
        return service.createemp(values);
    }

    //FIND BY ID

    @GetMapping("/findid/{empid}")
    public Registerpage findByIds(@PathVariable Long empid){

        return service.findById(empid);
    }

    // DELETE BY ID
    @DeleteMapping("/delete/{empid}")
    public  String deleteById(@PathVariable Long empid){
        service.delteById(empid);
        return  "Given Id Was Deleted Successfully "+empid ;
    }

    // POST FOR LOGIN

    @PostMapping("/loginpost")
    public String loginValidation(@RequestBody logindto login){

        return service.loginvalues(login);

    }


    // EMAIL CONTROLLER LOGICS

    @GetMapping("/email")
    public String sendingMail(){

        service.sendemail("prabhakarharish55@gmail.com","Ur Registering The Web SpringBoot Application","Login Successfully");
        return "Mail Was Sent";
    }

    @PostMapping("/postmail")
    public String postedmail(@RequestBody  emaildto dto){

        service.sendemailpost(dto);
        return "Posted";
    }
}
