package com.btn;

public class ShortestLongest {

    // my solution
    public static String shorterReverseLonger(String a, String b) {
        if (a.length() >= b.length()){
            return b + reverseString(a.split("")) + b;
        } else {
            return a + reverseString(b.split("")) + a;
        }
    }

    public static String reverseString(String[] arr){
        String result = "";
        for(int i = arr.length-1; i >= 0; i-- ){
            result += arr[i];
        }
        return result;
    }

    // other  solution
    public static String shorterReverseLonger2(String a, String b) {
        String shorter = (a.length() < b.length()) ? a : b;
        String longer = (a.length() < b.length()) ? b : a;
        return shorter + reverse(longer) + shorter;
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // another solution
    public static String shorterReverseLonger3(String a, String b) {
        return a.length() >= b.length() ?
                b + new StringBuilder(a).reverse() + b :
                a + new StringBuilder(b).reverse() + a;
    }

    public static void main(String[] args) {
        System.out.println(shorterReverseLonger("first", "abcde"));
    }
}
