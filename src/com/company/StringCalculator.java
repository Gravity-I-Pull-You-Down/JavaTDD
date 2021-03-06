package com.company;

import java.util.Arrays;
import java.util.Vector;

public class StringCalculator {
    static int count=0;
    public int Add(String number) throws Exception {
        ++count;
        int flag =0;
        //Finding Delimiter
        if(number.contains("//[")){
            Vector<String> vec = new Vector<String>();
            number = number.substring(2);
            while (number.contains("[")) {
                vec.addElement(number.substring(number.indexOf("[")+1,number.indexOf("]")));
                number = number.substring(number.indexOf("]") + 1);
             }
            for (int i=0;i< vec.size();++i)
                number = number.replaceAll(vec.get(i),",");
            number = number.replaceAll("\n", ",");
            number = number.replaceFirst(",","");

        }
        //Rest of stuff
        if (number.contains("//")) {
            int index = number.indexOf('\n');
            number = number.replaceAll(number.substring(2, index), ",");
            number = number.substring(4);
        }
        if (number.contains("\n")) {
            number = number.replaceAll("\n", ",");
        }

        if (number.trim().length() == 0)
        {return 0;}
        else if (!number.contains(",")) {
            return Integer.parseInt(number);
        }
        else {
            int sum = 0;
            String[] arr = number.split(",");
            for (int i=0;i<=arr.length-1;++i) {
                try {
                    if (0 > Integer.parseInt(arr[i])) {
                        String s = "negatives not allowed " + arr[i];
                        ++flag;
                        throw new NumberFormatException(s);
                    }
                    else if(Integer.parseInt(arr[i])<=1000){
                        sum += Integer.parseInt(arr[i]);
                    }
                }catch (NumberFormatException e){
                    System.out.println(e.toString());
                }
            }
            if(flag ==0)
            return sum;
            else
                return 0;
        }
    }
    public int GetCalledCount(){
//        System.out.println(count);
        return count;
    }
}
