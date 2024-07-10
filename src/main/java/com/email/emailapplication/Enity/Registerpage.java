package com.email.emailapplication.Enity;

import jakarta.persistence.*;

@Entity(name = "EMAIL")
public class Registerpage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empid;
    private String empname;
    private String depname;
    private  String email;
    private  String address;
    private String password;
    private String cpassword;

    public Registerpage() {
    }

    public Registerpage(Long empid, String empname, String depname, String email, String address, String password, String cpassword) {
        this.empid = empid;
        this.empname = empname;
        this.depname = depname;
        this.email = email;
        this.address = address;
        this.password = password;
        this.cpassword = cpassword;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
