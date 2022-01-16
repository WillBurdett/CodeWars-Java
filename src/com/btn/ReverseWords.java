package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public static String spinWords(String sentence) {
        String[] inputArr = sentence.split(" ");
        List<String> result = new ArrayList<>();
        for (String i : inputArr){
            String[] wordToArray = i.split("");
            if (wordToArray.length >= 5){
                String strToAdd = "";
                for (int j = wordToArray.length-1; j >= 0; j--){
                    strToAdd += wordToArray[j];
                }
                result.add(strToAdd);
                strToAdd = "";
            } else {
                result.add(i);
            }
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        String test = "Hey fellow warriors";
        System.out.println(spinWords(test));
    }
}
