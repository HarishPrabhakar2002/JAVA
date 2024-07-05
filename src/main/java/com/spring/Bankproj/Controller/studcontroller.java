package com.spring.Bankproj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Bankproj.Entity.studenttable;
import com.spring.Bankproj.Service.studservice;

@RestController
@RequestMapping("/api/src")
public class studcontroller {

	@Autowired
	private studservice src;
	
	@GetMapping("/get")
	public List<studenttable> getallmethod(){
		return src.getmethod();
		
	}
	
	@GetMapping("/get/{studid}")
	public studenttable geting(@PathVariable  Long studid ) {
		return src.ellam(studid);
	}
	
	
	
	@PostMapping("/post")
	public studenttable postingmethod(@RequestBody studenttable ithu) {
		return src.createmethod(ithu);
	}
	
	@DeleteMapping("/delete/{studid}")
	
	public String deletingid(@PathVariable Long studid ) {
		return src.deletestud(studid);

//	@GetMapping("/get/{studname}")
//			public studenttable finding(@PathVariable String name){
//
//
//	  return src.getthatname(name);
//		}



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
