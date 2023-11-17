package com.btn;

public class TriangleSummation1 {
    public static long getSum(int n){
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += addTwos(i+1, i);
        }
        return sum;
    }
    public static int addTwos(int n, int iter){
        int sum = n;
        int numToAdd = n;
        for (int i=iter; i > 0; i--){
            numToAdd += 2;
            sum += numToAdd;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(2));
    }
}
