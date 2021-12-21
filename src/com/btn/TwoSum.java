package com.btn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    // My Solution
    public static int[] twoSum(int[] numbers, int target){
        int[] result = {0,0};
        for(int i = 0; i<numbers.length;i++){
            for(int j = 0; j<numbers.length;j++){
                if (numbers[i] + numbers[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                    //System.out.println(Arrays.toString(result));
                }
            }
        }
        return result;
    }

    // Similar User-Submitted Solution
    public static int[] twoSumExemplar(int[] numbers, int target)
    {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] test = {1,2,3};
        System.out.println(twoSumExemplar(test, 4));
    }
}

