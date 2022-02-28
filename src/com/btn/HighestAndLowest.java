package com.btn;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

        String[] inputArr = numbers.split(" ");
        int highest = 0;
        int lowest = 0;

        for (int i=0; i<inputArr.length; i++){
            int current = Integer.parseInt(inputArr[i]);
            if (i == 0){
                highest = current;
                lowest = current;
            } else if (current > highest){
                highest = current;
            } else if (current < lowest){
                lowest = current;
            }
        }
        return highest + " " + lowest;
    }
}
