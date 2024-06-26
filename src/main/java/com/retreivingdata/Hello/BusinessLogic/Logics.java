package com.retreivingdata.Hello.BusinessLogic;
import com.retreivingdata.Hello.Repository.TableRepository;
import com.retreivingdata.Hello.Specification.Filtration;
import com.retreivingdata.Hello.TableCreation.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Logics {

    @Autowired
    private TableRepository tableRepository;


    public List<Table> getAllData() {
        return tableRepository.findAll();
    }


    public Table createtable(Table postdetails) {
        return tableRepository.save(postdetails);
    }

    public String Delete(Long Bookid) {
        tableRepository.deleteById(Bookid);

        return "Deleted";
    }
public List<Table>findByName(String Bookname) {
    Specification<Table> specification = Filtration.callingByName(Bookname);
    return tableRepository.findAll(specification);
}

    public List<Table>findByBookCode(int lowerBound,int upperBound){
        Specification<Table>specification=Filtration.betweenNumbers(lowerBound,upperBound);
        return  tableRepository.findAll(specification);
    }
    public List<Table>findByPrice(long greater,long lesser){
        Specification<Table>specification=Filtration.priceBetween(greater,lesser);
        return tableRepository.findAll(specification);
    }
    public List<Table>nameStartsWithAndEnd(char startLetter,char endLetter){
        Specification<Table>specification=Filtration.authorStartsWithAndEndsWith(startLetter, endLetter);
        return tableRepository.findAll(specification);
    }
}


