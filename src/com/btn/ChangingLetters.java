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
        System.out.println(swap("input"));
    }
}

