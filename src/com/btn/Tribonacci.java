package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tribonacci {
    public static double[] tribonacci(double[] s, int n) {

        // creating arraylist of initial values
        List<Double> arr = new ArrayList<>(){};
        for (int y =0; y < s.length; y++){
            arr.add(s[y]);
        }

        // if n is less than the array length they've submitted
        if (n< arr.size()){
            double[] result = new double[n];
            for (int i = 0; i < n; i++) {
                result[i] = arr.get(i).doubleValue();
            };
            return  result;
        }

        // sums the last 3 digits of the list
        double sum = 0;
        for (int j =0; j < n - 3; j++) {
            for (int i = arr.size()-1; i > arr.size() - 4; i--) {
               sum += arr.get(i);
            }
            arr.add(sum);
            sum = 0;
        }

        // create []double with correct length then loops/assigns the list values
        double[] result = new double[arr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(i).doubleValue();
        };

        return result;
    }

    public static void main(String[] args) {
        double[] test = {2,3,4};
        System.out.println(tribonacci(test, 5));
    }
}
