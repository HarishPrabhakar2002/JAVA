package com.specification.filtration.Service;

import com.specification.filtration.Entity.filter;
import com.specification.filtration.Exception.ResourceNotFoundException;
import com.specification.filtration.Repository.datastore;
import com.specification.filtration.specification.specify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

// service.java
@Service
public class    service {

    @Autowired
    private datastore repo;



    public List<filter> FindByCriteria(String name, Double price, String dept) {
        Specification<filter> spec = Specification.where(null);

        if (name != null)  {
            spec = spec.and(specify.GetName(name));
        }
        if (price != null) {
            spec = spec.and(specify.GetPrice(price));
        }
        if (dept != null) {
            spec = spec.and(specify.GetDept(dept));
        }
        List<filter> filters = repo.findAll(spec);
        if (filters.isEmpty()) {
            throw new ResourceNotFoundException("No filters found with the specified criteria");
        } else {
            return filters;
        }
    }

    public List<filter> getAllData() {
        return repo.findAll();
    }

    public filter createData(filter data) {
        return repo.save(data);
    }

}
