package com.spring.Bankproj.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud_without_lombak")
public class studenttable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long studid;
	
	
	@Column(name ="studname")
	private String studname;
	
	@Column(name="classname")
	private String classname;
	
	@Column(name="schoolname")
	private String schoolname;
	
	@Column(name="majorsub")
	private String majorsub;
	
	@Column (name="percentage")
	private int percentage;

	public studenttable() {
		super();
	}

	public studenttable(Long studid, String studname, String classname, String schoolname, String majorsub,
			int percentage) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.classname = classname;
		this.schoolname = schoolname;
		this.majorsub = majorsub;
		this.percentage = percentage;
	}

	public Long getStudid() {
		return studid;
	}

	public void setStudid(Long studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getMajorsub() {
		return majorsub;
	}

	public void setMajorsub(String majorsub) {
		this.majorsub = majorsub;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
	

}
