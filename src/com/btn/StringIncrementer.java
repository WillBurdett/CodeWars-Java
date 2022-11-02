package com.btn;

import java.util.Arrays;
import java.util.List;

public class StringIncrementer {

    // my solution
    public static String incrementString(String str) {

        String startOfString = "";
        String numbersToIncrement = "";
        boolean startedWithLettersOrHasHadANonNine = false;

        String[] inputArr = str.split("");

        for (int i = inputArr.length-1; i >= 0; i--) {

            if (!isNumber(inputArr[i])){
                startOfString = inputArr[i] + startOfString;
                startedWithLettersOrHasHadANonNine = true;
            } else if (isNumber(inputArr[i]) && !startedWithLettersOrHasHadANonNine && !inputArr[i].equals("9")) {
                numbersToIncrement = inputArr[i] + numbersToIncrement;
                startedWithLettersOrHasHadANonNine = true;
            } else if (inputArr[i].equals("9") && !startedWithLettersOrHasHadANonNine) {
                numbersToIncrement = inputArr[i] + numbersToIncrement;
            } else if (startedWithLettersOrHasHadANonNine){
                startOfString = inputArr[i] + startOfString;
            }
        }
        return numbersToIncrement.equals("") ? str + "1" :
        startOfString + formatNumbers(numbersToIncrement) ;
    }

    public static String formatNumbers(String s){
        String numToIncrement = String.valueOf(Long.valueOf(s) + 1);
        while (numToIncrement.length() < s.length()){
            numToIncrement = "0" + numToIncrement;
        }
        return numToIncrement;
    }

    public static Boolean isNumber(String s){
        return s.matches("\\d");
    }

    // others user's recursive solution
    public static String incrementString2(String str) {

        List<String> check = Arrays.asList(new String[] {"0","1","2","3","4","5","6","7","8","9"});

        if(str.length()== 0|| !check.contains(str.substring(str.length()-1))){return str +"1";}


        return str.substring(str.length()-1).equals("9") ? incrementString(str.substring(0,str.length()-1)) +"0": str.substring(0,str.length()-1) + String.valueOf( Integer.parseInt( str.substring(str.length()-1) ) +1  );
    }

    public static void main(String[] args) {
        System.out.println(isNumber("T"));
        System.out.println(incrementString("254677633460483107992123672612762"));
    }
}
