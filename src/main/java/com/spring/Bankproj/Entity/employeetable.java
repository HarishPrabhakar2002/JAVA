package com.spring.Bankproj.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="emp_with_lombak")

public class employeetable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="empname")
	private String empname;
	
	
	@Column(name ="position")
	private String positionname;
	
	@Column(name ="Salary")
	private int salary;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Companyname")
	private String companyname;
	
	@Column(name ="companydes")
	private String companydes;

	public employeetable() {
	}

	public employeetable(long id, String empname, String positionname, int salary, String address, String companyname, String companydes) {
		this.id = id;
		this.empname = empname;
		this.positionname = positionname;
		this.salary = salary;
		this.address = address;
		this.companyname = companyname;
		this.companydes = companydes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getPositionname() {
		return positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanydes() {
		return companydes;
	}

	public void setCompanydes(String companydes) {
		this.companydes = companydes;
	}
}
