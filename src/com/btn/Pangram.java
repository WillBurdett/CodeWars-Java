package com.btn;

public class Pangram {
    // My solution
    public static boolean check(String sentence){
        sentence = sentence.toLowerCase();
        String[] arr = sentence.split("");
        String alphabet = "";
        int counter = 0;
        boolean contained = false;
        for (int i=0; i< arr.length; i++){
            if (alphabet.contains(arr[i]) == false && arr[i].matches("[a-z]")){
                alphabet+=arr[i];
                counter++;
            }
        }
        boolean result = (counter == 26) ? true:false;
        return result;
    }

    // Looping through alphabet! (user-submitted solution)
    public boolean checker(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
    public static void main(String[] args) {
        System.out.println(check("sthe quick brown fox jumped over the lazy dog"));
    }
}
