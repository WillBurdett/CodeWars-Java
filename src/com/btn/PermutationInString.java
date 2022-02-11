package com.btn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        List<String> s1List = Arrays.asList(s1.split(""));
        List<String> s2List = Arrays.asList(s2.split(""));

        int end = s1List.size();
        // 'i' will be our start point

        Map <String, Integer> benchmark = toMap(s1List);

        for(int i=0; end<=s2List.size(); i++){
            List<String> sub = s2List.subList(i, end);
            Map<String, Integer> test = toMap(sub);
            if(test.equals(benchmark)){
                return true;
            }
            end++;
        }
        return false;
    }
    public static Map<String, Integer> toMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","cba"));
    }
}
