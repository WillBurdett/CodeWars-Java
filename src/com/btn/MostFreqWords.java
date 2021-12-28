package com.btn;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class MostFreqWords {
    public static List<String> top3(String s) {
        s = s.toLowerCase(Locale.ROOT);
        Pattern pattern = Pattern.compile("[a-z]\s", Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        String[] userArr = s.split(" ");
        Map <String,Integer>resultMap = new HashMap<>();

        for (int i = 0; i < userArr.length; i++){
            if (resultMap.containsKey(userArr[i])){
                resultMap.put(userArr[i], resultMap.get(userArr[i]) + 1);
            } else {
                resultMap.put(userArr[i], 1);
            }
        }

        List<Map.Entry<String, Integer>> result = new ArrayList(resultMap.entrySet());
        result.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> answer = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : result) {
            answer.put(entry.getKey(), entry.getValue());
        }
        System.out.println(answer);

        List <String> finalAnswer = new ArrayList<>();
//        finalAnswer = List.of(answer.get());
        return null;
    }

    public static void main(String[] args) {
        System.out.println(top3("I have to say, yes yes"));
    }
}
