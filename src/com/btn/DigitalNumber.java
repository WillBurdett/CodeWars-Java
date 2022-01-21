package com.btn;

public class DigitalNumber {
    public static int digital_root(int n) {
        String[] inputArr =String.valueOf(n).split("");
        int total = 0;
        while (inputArr.length != 1){
            for (String i : inputArr){
                total+=Integer.parseInt(i);
            }
            inputArr = String.valueOf(total).split("");
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(54));
    }
}
