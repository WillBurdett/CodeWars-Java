package com.btn;

public class ChangingLetters {
    public static String swap(String st){
       return st.replaceAll("e", "E")
               .replaceAll("a", "A")
               .replaceAll("i", "I")
               .replaceAll("o", "O")
               .replaceAll("u", "U");
    }
    public static void main(String[] args) {
        for (String s:
             args) {
            System.out.println(swap(s));
        }
    }
}

// javac com/btn/ChangingLetters.java
// java com/btn/ChangingLetters



