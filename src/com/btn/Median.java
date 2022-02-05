package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    // find the median of two arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            result.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            result.add(nums2[i]);
        }

        Collections.sort(result);

        double answer = 0.0;

        if (result.size() % 2 != 0) {
            answer = (double) result.get(result.size() / 2);
        } else if (result.size() % 2 == 0) {
            double lower = (double) result.get(result.size() / 2 - 1);
            double higher = (double) (result.get(result.size() / 2));
            answer = (lower + higher) / 2;
        }

        System.out.println(answer);
        return answer;
    }

    // alternative using only arrays
    public static double findMedianSorted(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];

        for (int i : nums1) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    arr[j] = i;
                    break;
                }
            }
        }
        for (int i : nums2) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    arr[j] = i;
                    break;
                }
            }
        }

        int[] result = new int[arr.length];

        int num1index = 0;
        int num2index = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (num1index == nums1.length && num2index == nums2.length){
                break;
            } else if (num1index == nums1.length || num2index == nums2.length){
                        if (num1index == nums1.length){
                            result[i] = nums2[num2index];
                            num2index++;
                        } else if (num2index == nums2.length) {
                            result[i] = nums1[num1index];
                            num1index++;
                        }
            } else if (nums1[num1index] == nums2[num2index]) {
                result[i] = nums1[num1index];
                num1index++;
            } else if (nums1[num1index] < nums2[num2index]) {
                result[i] = nums1[num1index];
                num1index++;
            } else if (nums1[num1index] > nums2[num2index]) {
                result[i] = nums2[num2index];
                num2index++;
            }
        }

        double answer = 0.0;

        if (result.length % 2 != 0){
            answer = result[result.length/2];
        } else {
            int index = result.length/2;
            double higher = result[index];
            double lower = result[index - 1];
            answer = (higher + lower) / 2;
        }

        System.out.println(Arrays.toString(result));
        System.out.println(answer);
            return answer;
    }

        public static void main (String[]args){
            int[] test = {1, 3};
            int[] test2 = {2, 4, 5};

            // findMedianSortedArrays(test, test2);
            findMedianSorted(test, test2);

        }
    }