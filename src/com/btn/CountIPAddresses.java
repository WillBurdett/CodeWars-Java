package com.btn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountIPAddresses {
    public static long totalSum(String input){
        String[] inputArr = input.split("\\.");
        Long inputSum = 0L;
        int Multiplier = 1;
        for (int i = inputArr.length - 1; i >= 0; i--){
            inputSum += Integer.parseInt(inputArr[i]) * Multiplier;
            Multiplier += 255 * Multiplier;
        }
        return inputSum;
    }
    public static long ipsBetween(String start, String end) {
        return totalSum(start) > totalSum(end) ? totalSum(start) - totalSum(end) : totalSum(end) - totalSum(start);
    }
//    public static long ipsBetween(String start, String end) {
//
//        start = start.replace(".", " ");
//        String[] startArr = start.split(" ");
//        // String test = Arrays.toString(startArr);
//        Long startSum = 0L;
//        int Multiplier = 1;
//        for (int i = startArr.length - 1; i >= 0; i--){
//            //System.out.println(startArr[i]);
//            startSum += Integer.parseInt(startArr[i]) * Multiplier;
//            Multiplier += 255 * Multiplier;
//        }
//
//        end = end.replace(".", " ");
//        String[] endArr = end.split(" ");
//        // String test2 = Arrays.toString(endArr);
//        Long endSum = 0L;
//        int Multiplier2 = 1;
//        for (int i = endArr.length - 1; i >= 0; i--){
//            //System.out.println(endArr[i]);
//            endSum += Integer.parseInt(endArr[i]) * Multiplier2;
//            Multiplier2 += 255 * Multiplier2;
//        }
//        return startSum > endSum ? startSum - endSum : endSum - startSum;
//    }

    public static void main(String[] args) {
        System.out.println(ipsBetween("170.0.0.0", "170.1.0.0"));
    }
}
