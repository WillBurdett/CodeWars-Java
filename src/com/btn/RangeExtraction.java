package com.btn;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeExtraction {

    // My solution
    public static boolean diff(int a , int b){
        int lower = a < b ? a : b;
        int bigger = a > b ? a : b;
        int counter = 0;
        for (int i = 0; lower != bigger; i++){
            lower++;
            counter++;
        }
        return counter <= 1 ? true : false;
    }

    public static String rangeExtraction(int[] arr) {
        System.out.println(Arrays.toString(arr));
        ArrayList<String>resultArr = new ArrayList<>();
        String toAdd = "";
        int counter = 0;
        for (int i = 1; i < arr.length; i++){
            if (!diff(arr[i], arr[i-1]) && toAdd == ""){
                resultArr.add(String.valueOf(arr[i-1]));
                if (i + 1 == arr.length){
                    resultArr.add(String.valueOf(arr[i]));
                }
            } else if (diff(arr[i], arr[i-1]) && toAdd == ""){
                counter++;
                toAdd = String.valueOf(arr[i-1]);
                if (i + 1 == arr.length){
                    resultArr.add(String.valueOf(arr[i-1]));
                    resultArr.add(String.valueOf(arr[i]));
                }
            } else if (diff(arr[i], arr[i-1]) && toAdd != ""){
                counter++;
                if (i + 1 == arr.length){
                    resultArr.add(toAdd + "-" + arr[i]);
                }
            } if ( !diff(arr[i], arr[i-1]) && toAdd != "" && counter < 2){
                resultArr.add(String.valueOf(arr[i-2]));
                resultArr.add(String.valueOf(arr[i-1]));
                if (i + 1 == arr.length){
                    resultArr.add(String.valueOf(arr[i]));
                }
                counter = 0;
                toAdd = "";
            }else if (!diff(arr[i], arr[i-1]) && toAdd != "" && counter > 1){
                resultArr.add(toAdd + "-" + arr[i-1]);
                toAdd = "";
                counter = 0;
            }
        }
        String listString = String.join(",", resultArr);
        return listString;
    }
    // user-submitted solution
    public static String userRangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) j++;
            if (i + 1 < j) {
                i = j;
                sb.append("-");
                sb.append(arr[i]);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] test = {-34, -33, -31, -29, -28, -26, -23, -21, -18, -15, -14, -13, -12, -10, -8, -6, -3, -1, 0, 1, 2, 5, 8, 9, 10, 12, 14, 15};
        System.out.println(rangeExtraction(test));
        System.out.println(diff(-6,-1));
    }
}
