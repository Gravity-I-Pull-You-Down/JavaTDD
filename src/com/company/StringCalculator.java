package com.company;

public class StringCalculator {

    public static int Add(String number) throws Exception {
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
                        throw new NumberFormatException(s);
                    }
                    sum += Integer.parseInt(arr[i]);
                }catch (NumberFormatException e){
                    System.out.println(e.toString());
                }
            }

            return sum;
        }
    }
}
