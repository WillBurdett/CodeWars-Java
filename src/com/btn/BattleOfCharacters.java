package com.btn;

import java.util.HashMap;
import java.util.Map;

public class BattleOfCharacters {
    public static String battle(final String x, final String y) {

        Map<String, Integer> alphabetNumbers = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 1; i <27; i++){
            alphabetNumbers.put(String.valueOf(alphabet[i - 1]).toUpperCase(), i);
        }

        int scoreForX = 0;
        int scoreForY = 0;

        String[] xAsArray = x.split("");
        String[] yAsArray = y.split("");

        for(String letter : xAsArray){
            scoreForX += alphabetNumbers.get(letter);
        }
        for(String letter : yAsArray){
            scoreForY += alphabetNumbers.get(letter);
        }

        if (scoreForX == scoreForY){
            return "Tie!";
        }
        return scoreForX > scoreForY ? x : y; // Let the battle begin!
    }


    // other users solution

        public static String battleOf(final String x, final String y) {
            int powerA=0;
            int powerB=0;
            for(char a : x.toCharArray())
                powerA+=a-64;
            for(char b : y.toCharArray())
                powerB+=b-64;
            if(powerA==powerB)
                return "Tie!";
            if(powerA>powerB)
                return x;
            else
                return y;
    }


    public static void main(String[] args) {
        System.out.println(battle("ONE","TWO"));
    }
}
