package com.retreivingdata.Hello.Functions;
import com.retreivingdata.Hello.BusinessLogic.LogicsServices;
import com.retreivingdata.Hello.TableCreation.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class TableFunctions {

    @Autowired
    private LogicsServices logics;

    @GetMapping("/get")
public List<Employee> findingData(){
        return  logics.getAllData();
    }
    @PostMapping("/post")
    public  Employee postingData(@RequestBody Employee tabledata){
        return  logics.createtable(tabledata);
    }

@DeleteMapping("/delete/{Bookid}")
    public String deleted(@PathVariable Long Bookid){
       return logics.Delete(Bookid);


}
@GetMapping("/sortby")
public List<Employee> findByName(@RequestParam(required = false)String Bookname){
        return logics.findByName(Bookname);
}


@GetMapping("/sortbycode")
    public List<Employee> findTheBookCode(@RequestParam (name= "lowerBound") int lowerBound,
                                      @RequestParam(name= "upperBound")  int upperBound){
        return logics.findByBookCode(lowerBound,upperBound);
}
@GetMapping("/sortbyprice")
public List<Employee> findTheBookPrice(@RequestParam(name = "greater")long greater,
                                   @RequestParam(name = "lesser")long lesser){
        return logics.findByPrice(greater,lesser);
}
@GetMapping("/sortbychar")
    public List<Employee> findByStartCharAndEndChar(@RequestParam("startLetter")char startLetter,
                                                 @RequestParam("endLetter")char endLetter){
    return logics.nameStartsWithAndEnd(startLetter,endLetter);
    }

}
