package com.btn;

import java.util.ArrayList;
import java.util.List;

public class TriangleSummation1 {
    public static long getSum(int n){
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += addTwos(i+1);
        }
        System.out.println("Get sum = " + sum);
        return sum;
    }
    public static int addTwos(int n){
        List<Integer> columnList = new ArrayList<>();
        columnList.add(n);
        int numToAdd = n;
        while (columnList.size() < n){
            numToAdd += 2;
            columnList.add(numToAdd);
        }
        System.out.println("add twos = " + columnList);
        return sumList(columnList);
    }

    public static int sumList(List<Integer> input){
        int sum = 0;
        for (int n:
             input) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(2));
    }
}
