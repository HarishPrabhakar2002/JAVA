package com.spring.Bankproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Bankproj.Entity.employeetable;
import com.spring.Bankproj.Entity.studenttable;

@Repository
public interface emprepo extends JpaRepository<employeetable,Long>{
   // employeetable emp(String empname);

    employeetable emp(String empname);
}
