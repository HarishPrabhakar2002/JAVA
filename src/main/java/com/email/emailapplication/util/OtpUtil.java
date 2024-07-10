package com.email.emailapplication.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OtpUtil {

    public  String otpGenerator(){
        Random random=new Random();
         int randomnumber=random.nextInt(999999);
         String output=Integer.toString(randomnumber);
         while (output.length() <6){
             output ="0"+output;
         }
         return output;
    }
}
