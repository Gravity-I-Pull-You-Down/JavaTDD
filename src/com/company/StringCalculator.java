package com.company;

import org.junit.internal.runners.model.ReflectiveCallable;

import java.util.Vector;

public class StringCalculator {

    public static int Add(String number){
        if(number.trim().length()==0)
            return 0;
        if(!number.contains(","))
            return Integer.parseInt(number);
        else {
            int index =0,sum =0;
            while(index<=number.length()){
                sum += Integer.parseInt(String.valueOf(number.charAt( number.indexOf(',',index)+1)));
                index+=2;
            }
            return sum;
        }
    }
}
