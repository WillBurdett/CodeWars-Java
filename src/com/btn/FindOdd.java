package com.btn;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < a.length; i++){
            if (resultMap.containsKey(a[i])){
                resultMap.put(a[i], resultMap.get(a[i]) + 1);
            } else
            resultMap.put(a[i], 1);
        }
        for (int i = 0; i < a.length; i++){
            if(resultMap.get(a[i]) % 2 != 0){
                return a[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] test = {1,2,3,2,1};
        findIt(test);
    }
}
