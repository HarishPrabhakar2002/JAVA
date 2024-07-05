package com.spring.Bankproj.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Bankproj.Entity.studenttable;
import com.spring.Bankproj.repository.studrepo;

@Service
public class studservice {

	
	@Autowired
	private studrepo stud;
	
	public List<studenttable> getmethod(){
		return stud.findAll();
		
}
	public studenttable createmethod(studenttable ithu) {
		return stud.save(ithu);
	}
	public List<studenttable> saveallmethod(List<studenttable> saved){
		return stud.saveAll(saved);
	}
	
	
	public studenttable ellam(Long studid) {
		return stud.findById(studid).orElse(null);
	}

//	public studenttable getname(String studname) {
//		return stud.findBy(studname);
//
//	}
//
	public String deletestud(Long studid) {
		stud.deleteById(studid);
		return "id Was Deleted Successfully "+studid;
	}

	public studenttable getthatname(String studname){
		return  stud.getstudname(studname);
	}

	
	
	
	
}
