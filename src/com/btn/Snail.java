package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array) {

        // Calculates the length of input
        int lengthOfAnswer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                lengthOfAnswer++;
            }
        }
        System.out.println(lengthOfAnswer);
        int rows = array.length;
        int columns = array[0].length;

        int numbersAdded = 0;
        List<Integer> result = new ArrayList<>();
        // Outer-Most indexes
        int topRow = 0;
        int lastNum = columns-1;
        int firstNum = 0;
        int bottomRow = rows-1;

        // the idea is to update the named rows/columns if there is not one number left at the end.
        for (int i = topRow; i <= lastNum; i++) {
            result.add(array[topRow][i]);
        }
        for (int i = topRow + 1; i <= bottomRow; i++){
            result.add(array[i][lastNum]);
        }
        // the ones below need changing
        for (int i = columns-2; i >= 0; i--){
            result.add(array[rows-1][i]);
        }
        for (int i = rows -2; i > 0; i--){
            result.add(array[i][0]);
        }
        if (result.size() == lengthOfAnswer - 1){
            result.add(array[(rows-1)/2][(columns-1)/2]);
        }
        System.out.println(result);
        return null;
    }










    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(snail(array));
    }
}
