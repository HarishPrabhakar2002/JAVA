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

import com.spring.Bankproj.Entity.employeetable;
import com.spring.Bankproj.Service.empservice;

@RestController
@RequestMapping("/api/in")
public class empcontroller {

	@Autowired
	private empservice ser;
	
	
	@GetMapping("/get")
	public List<employeetable>findall(){
		return ser.getmethod();
	}
	
	@PostMapping("/post")
	public employeetable postmapping(@RequestBody employeetable venum) {
		return ser.createmethod(venum);
	}


		@GetMapping("/getid/{id}")
		public employeetable findbyid(@PathVariable int id) {
			return ser.findbyid(id);
		}
		
		@DeleteMapping("/delete/{id}")
		public String empdelete(@PathVariable int id) {
			return ser.deleteemployee(id);
		}
		@GetMapping("/get/{empname}")
	public employeetable getname(@PathVariable String empname){
		return ser.findbyname(empname);
		}














}
