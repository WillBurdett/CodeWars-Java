package com.btn;

public class PalindromeChecker {
        public boolean isPalindrome(int x) {

            String input = String.valueOf(x);

            String[] inputArr = input.split("");

            String reversed = "";

            for(int i=inputArr.length-1; i>=0; i--){
                reversed+=inputArr[i];
            }
            if (input.equals(reversed)){
                return true;
            }
            return false;
        }
}
