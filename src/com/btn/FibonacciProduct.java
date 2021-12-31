package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciProduct {
    public static long[] productFib(long prod) {
        return null;
    }
    public  static long[] fibSequence(long length){
        // create Fibonacci Sequence
        List<Long> f  = new ArrayList<>(List.of(0L, 1L, 1L));
        Long sum = 0L;
        for (int j =0; j < length - 3; j++) {
            for (int i = f.size()-1; i > f.size() - 3; i--) {
                sum += f.get(i);
            }
            f.add(sum);
            sum = 0L;
        }
        long[] result = f.stream().mapToLong(l -> l).toArray();
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibSequence(5L));
    }
}
