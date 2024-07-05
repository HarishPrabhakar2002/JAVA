package com.retreivingdata.Hello.TableCreation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity

@jakarta.persistence.Table(name = "university")
public class    Employee     {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Bookid;

    private String Bookname;

    private Integer Bookcode;

    private long Bookprice;

    private String Author;

    public Employee() {
    }

    public Employee(Long bookid, String bookname, Integer bookcode, long bookprice, String author) {
        Bookid = bookid;
        Bookname = bookname;
        Bookcode = bookcode;
        Bookprice = bookprice;
        Author = author;
    }


    public Long getBookid() {
        return Bookid;
    }

    public void setBookid(Long bookid) {
        Bookid = bookid;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public Integer getBookcode() {
        return Bookcode;
    }

    public void setBookcode(Integer bookcode) {
        Bookcode = bookcode;
    }

    public long getBookprice() {
        return Bookprice;
    }

    public void setBookprice(long bookprice) {
        Bookprice = bookprice;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
