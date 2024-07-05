package com.specification.filtration.specification;

import com.specification.filtration.Entity.filter;
import org.springframework.data.jpa.domain.Specification;

public class specify  {
    public static  Specification<filter> GetName(String name){
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("name"),name));
    }
    public static Specification<filter>    GetPrice(Double price){
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("price"),price));
    }
    public   static Specification<filter>GetDept(String dept){
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("dept"),dept));
    }


}
