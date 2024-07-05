package com.spring.Bankproj.Service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Bankproj.Entity.employeetable;
import com.spring.Bankproj.repository.emprepo;

@Service
public class empservice {

	@Autowired
	private emprepo emp;
	
	public java.util.List<employeetable>getmethod()
	{
		return emp.findAll();
	}
	
	public employeetable createmethod(employeetable ithu) {
		return emp.save(ithu);
	}
	
	
	public java.util.List<employeetable>saveemployee(java.util.List<employeetable> ithu){
		return emp.saveAll(ithu);
	}
	
	
	public employeetable findbyid(long id  ) {
		return emp.findById(id).orElse(null);
	}
	
	public String deleteemployee(long id ) {
		
				emp.deleteById(id) ;

	return "Selected Emp Id was Deleted Succesfully!! "+id;

	
	}
	public employeetable findbyname(String empname ) {
		return emp.emp(empname);

	}
	
}
