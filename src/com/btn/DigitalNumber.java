package com.btn;

public class DigitalNumber {
    public static int sum(String[] input){
        Integer sum = 0;
        for (String i : input){
            sum+=Integer.parseInt(i);
        }
        return sum;
    }
    public static int digital_root(int n) {
        String inputToStr = String.valueOf(n);
        String[] inputArr = inputToStr.split("");
        int total = 0;
        while (inputArr.length != 1){
            total = sum(inputArr);
            inputArr = String.valueOf(total).split("");
        }
        return total;
    }
}
