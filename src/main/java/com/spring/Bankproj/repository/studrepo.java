package com.spring.Bankproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Bankproj.Entity.studenttable;

@Repository
public interface studrepo extends JpaRepository<studenttable,Long> {

 studenttable getstudname(String studname);

	
}
