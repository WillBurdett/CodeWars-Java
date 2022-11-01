package com.btn;

public class StringIncrementer {

    public static String incrementString(String str) {

        String endOfString = "";
        String startOfString = "";
        String numbersToIncrement = "";
        boolean hasBeenNumbers = false;

        String[] inputArr = str.split("");

        for (int i = inputArr.length-1; i >= 0; i--) {

            if (!isNumber(inputArr[i]) && !numbersToIncrement.equals("")){
                startOfString = inputArr[i] + startOfString;
                hasBeenNumbers = true;
            } else if (!isNumber(inputArr[i]) && numbersToIncrement.equals("")) {
                endOfString = inputArr[i] + endOfString;
            } else if (isNumber(inputArr[i]) && !hasBeenNumbers && !inputArr[i].equals("9")) {
                numbersToIncrement = inputArr[i] + numbersToIncrement;
                hasBeenNumbers = true;
            } else if (inputArr[i].equals("9") && !hasBeenNumbers) {
                numbersToIncrement = inputArr[i] + numbersToIncrement;
            } else if (hasBeenNumbers){
                startOfString = inputArr[i] + startOfString;
            }
        }
        if (numbersToIncrement.equals("") || !isNumber(inputArr[inputArr.length-1])){
            return str + "1";
        }

        return  startOfString + formatNumbers(numbersToIncrement) + endOfString;

    }

    public static String formatNumbers(String s){
        String incrementedNumber = String.valueOf(Long.valueOf(s) + 1);
        while (incrementedNumber.length() < s.length()){
            incrementedNumber = "0" + incrementedNumber;
        }
        return incrementedNumber;
    }

    public static Boolean isNumber(String s){
        String nums = "0123456789";
        String[] numArr = nums.split("");
        for(int i=0; i < numArr.length; i++){
            if (numArr[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("T"));
        System.out.println(incrementString("254677633460483107992123672612762"));
    }
}
