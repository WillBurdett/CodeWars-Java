//package com.btn;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class DeleteFromArray {
//    public static int[] arrayDiff(int[] a, int[] b) {

        // FIRST TIME
//        String matches = "";
//        int arrayLength = 0;
//        for (int i = 0; i<a.length;i++){
//            int counter = 0;
//              for(int j = 0; j<b.length;j++){
//                 if (a[i] == b[j]){
//                      counter++;
//                  }
//            }
//              if (counter == 0){
//                  matches += a[i] + " ";
//              }
//        }
//        arrayLength = matches.length() / 2;
//        System.out.println(arrayLength);
//        String [] spl = matches.split(" ");
//        int [] c = new int[arrayLength];
//        for (int x =0; x<spl.length;x++){
//            c[x] = Integer.parseInt(spl[x]);
//        }
//        System.out.println(Arrays.toString(c));
//        return c;

        // BABA'S SOLUTION

//        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> bList = Arrays.stream(a).boxed().collect(Collectors.toList());
//        aList.removeAll(bList);
//        int[] result = aList.stream().mapToInt(integer -> integer).toArray();
//        System.out.println(aList);
//        return result;
//    }
//}
