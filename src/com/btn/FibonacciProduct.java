package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciProduct {

    public  static long[] fibSequence(long length) {
        List<Long> f = new ArrayList<>(List.of(0L, 1L, 1L));
        Long num1 = 0L, num2 = 1L;

        for (int i = 1; i <= length; ++i) {
            f.add(num1);
            Long sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return f.stream().mapToLong(l -> l).toArray();
    }

    public static long[] result(Long a, long b, boolean bool){
        return bool ? new long[]{a,b,1}:new long[]{a,b,0};
    }

    public static long[] productFib(long prod) {
        long[] fSeq = Arrays.stream(fibSequence(prod/prod * 3)).toArray();
        for (int i = 1; i < fSeq.length; i++){
            if (fSeq[i] * fSeq[i-1] == prod) {
                return result(fSeq[i-1], fSeq[i],true);
            } else if (fSeq[i] * fSeq[i-1] > prod){
                return result(fSeq[i-1], fSeq[i], false);
            }
        }
        return null;
    }
    // user-submitted
    public static long[] userProductFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
            long tmp = a;
            a = b;
            b = tmp + b;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
    }

    public static void main(String[] args) {
        System.out.println(fibSequence(100L));
        System.out.println(productFib(58L));
    }
}
