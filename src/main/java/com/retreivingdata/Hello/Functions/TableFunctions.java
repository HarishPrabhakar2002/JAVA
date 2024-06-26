package com.retreivingdata.Hello.Functions;

import com.retreivingdata.Hello.BusinessLogic.Logics;
import com.retreivingdata.Hello.TableCreation.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class TableFunctions {

    @Autowired
    private Logics logics;

    @GetMapping()
public List<Table> findingData(){
        return  logics.getAllData();
    }
    @PostMapping("/post")
    public  Table postingData(@RequestBody Table tabledata){
        return  logics.createtable(tabledata);
    }

@DeleteMapping("/delete/{Bookid}")
    public String deleted(@PathVariable Long Bookid){
       return logics.Delete(Bookid);


}
@GetMapping("/sortby")
public List<Table>findByName(@RequestParam(required = false)String Bookname){
        return logics.findByName(Bookname);
}


@GetMapping("/sortbycode")
    public List<Table>findTheBookCode(@RequestParam (name= "lowerBound") int lowerBound,
                                      @RequestParam(name= "upperBound")  int upperBound){
        return logics.findByBookCode(lowerBound,upperBound);
}
@GetMapping("/sortbyprice")
public List<Table>findTheBookPrice(@RequestParam(name = "greater")long greater,
                                   @RequestParam(name = "lesser")long lesser){
        return logics.findByPrice(greater,lesser);
}
@GetMapping("/sortbychar")
    public List<Table>findByStartCharAndEndChar(@RequestParam("startLetter")char startLetter,
                                                 @RequestParam("endLetter")char endLetter){
    return logics.nameStartsWithAndEnd(startLetter,endLetter);
    }

}
