package com.retreivingdata.Hello.BusinessLogic;
import com.retreivingdata.Hello.Repository.TableRepository;
import com.retreivingdata.Hello.Specification.Filtration;
import com.retreivingdata.Hello.TableCreation.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogicsServices {

    @Autowired
    private TableRepository tableRepository;
    private  Filtration filtration;


    public List<Employee> getAllData()    {
        return tableRepository.findAll();
    }


    public Employee createtable(Employee postdetails) {
        return tableRepository.save(postdetails);
    }

    public String Delete(Long Bookid) {
        tableRepository.deleteById(Bookid);

        return "Deleted";
    }
public List<Employee> findByName(String Bookname) {
    Specification<Employee> specification = filtration.callingByName(Bookname);
    return tableRepository.findAll(specification);
}

    public List<Employee> findByBookCode (int lowerBound,int upperBound){
        Specification<Employee>specification=Filtration.betweenNumbers(lowerBound,upperBound);
        return  tableRepository.findAll(specification);
    }
    public List<Employee> findByPrice(long greater,long lesser){
        Specification<Employee>specification=Filtration.priceBetween(greater,lesser);
        return tableRepository.findAll(specification);
    }
    public List<Employee> nameStartsWithAndEnd(char startLetter,char endLetter){
        Specification<Employee>specification=Filtration.authorStartsWithAndEndsWith(startLetter, endLetter);
        return tableRepository.findAll(specification);
    }
}


