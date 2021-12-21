//package com.btn;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class EnoughIsEnough {
//    public static int[] deleteNth(int[] elements, int maxOccurrences) {
//        List<Integer> aList = new ArrayList<>();
//        for (int i = 0; i < elements.length; i++){;
//            if (Collections.frequency(aList, elements[i]) < maxOccurrences){
//                aList.add(elements[i]);
//            }
//        }
//        System.out.println(aList);
//        int [] result = aList.stream().mapToInt(integer -> integer).toArray();
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] test1 = { 20, 37, 20, 21 }; // 1 time
//        deleteNth(test1, 1);
//    }
//
//}

