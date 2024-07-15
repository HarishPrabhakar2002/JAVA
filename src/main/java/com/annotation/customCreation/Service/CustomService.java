package com.annotation.customCreation.Service;
import com.annotation.customCreation.Entity.TableEntity;
import com.annotation.customCreation.Repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomService {
    @Autowired
    private repository repository;

    public List<TableEntity>entityList(){
        return repository.findAll();
    }
    public TableEntity tables(TableEntity tab){
        return repository.save(tab);
    }
    public List<TableEntity> table(String name){
        return repository.findByName(name);
    }

}
