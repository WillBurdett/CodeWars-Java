package com.btn;

import java.util.Arrays;

public class SquareOrNotToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double num = Math.sqrt(Double.valueOf(array[i]));
            if (checkPerfectSquare(num)) {
                array[i] = (int) num;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    static boolean checkPerfectSquare(double number) {
        return ((number - Math.floor(number)) == 0);
    }

    public static int[] otherUsersSquareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] { 4, 3, 9, 7, 2, 1 })));
    }
}
