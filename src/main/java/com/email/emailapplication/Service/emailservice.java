package com.email.emailapplication.Service;

import com.email.emailapplication.Dto.emaildto;
import com.email.emailapplication.Dto.logindto;
import com.email.emailapplication.Enity.Registerpage;
import com.email.emailapplication.Reposittory.registerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class emailservice {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private registerrepo repo;



//    String recipient="";
//    String body="";
//    String subject="";

    // GET METHOD

    public List<Registerpage>findAllData(){
        return repo.findAll();
    }
    //  POST METHOD

    public Registerpage createemp(Registerpage empl){

        emaildto si=new emaildto();



        si.setRecipient(empl.getEmail());
        si.setBody("CONTENT : Ur Details are been Registered Successfully..Login With Ur Given Details ..Thank You!!");
        si.setSubject("Registeration Successfully");
        sendemailpost(si);
     return  repo.save(empl);

    }

    // FIND BY ID
    public  Registerpage findById(Long empid){
        return  repo.findById(empid).orElse(null);

    }

    // DELETE BY ID

    public  String delteById(Long empid){
        repo.deleteById(empid);
        return "Deleted";
    }


    //          Posting For Login appplication

    public String loginvalues(logindto login){

        Registerpage registerpage= repo.findByemail(login.getUsername());
        if(registerpage.getPassword().equals(login.getPassword())){

//            recipient=username;
//            body="Ur Details are been Registerd Successfully, Now Login Using Ur Email..Thank You!!";
//            subject="Register Successfully";
//            sendemail(recipient,body,subject);
            emaildto si=new emaildto();

            si.setRecipient(login.getUsername());
            si.setBody("Email id :"+login.getUsername()+
                    "Password "+login.getPassword()+" Ur Details are been Login Successfully ..Thank You!!");
            si.setSubject("Login Successfully");
            sendemailpost(si);
            return "Mail was Sent";

        }
        else {
                return "Invalid Password";
        }

    }

                        //  Email Logics

    @Value("$spring.mail.username")
    private  String frommailid;

    public  void  sendemailpost(emaildto dto){

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();


        simpleMailMessage.setFrom(frommailid);
        simpleMailMessage.setTo(dto.getRecipient());
        simpleMailMessage.setText(dto.getBody());
        simpleMailMessage.setSubject(dto.getSubject());

        javaMailSender.send(simpleMailMessage);

    }
    public  void  sendemail(String recipient,String body,String subject){

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();


        simpleMailMessage.setFrom(frommailid);
        simpleMailMessage.setTo(recipient);
        simpleMailMessage.setText(body);
        simpleMailMessage.setSubject(subject);

        javaMailSender.send(simpleMailMessage);

    }


            // Advanced Email

//    public  String register()

















}
