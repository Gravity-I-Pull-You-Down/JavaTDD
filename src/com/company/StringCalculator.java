package com.company;

public class StringCalculator {

    public static int Add(String number){
        if(number.length()==0)
            return 0;
        if(!number.contains(","))
            return Integer.parseInt(number);
        else return Integer.parseInt(String.valueOf(number.charAt(0))) + Integer.parseInt(String.valueOf(number.charAt(2)));
    }
}
