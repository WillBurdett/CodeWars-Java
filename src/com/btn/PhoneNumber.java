package com.btn;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    // My solution
    public static String createPhoneNumber(int[] numbers) {
        List<Integer>userInput= new ArrayList<Integer>(numbers.length);
        for (int i : numbers)
        {
            userInput.add(i);
        }
        int index = 0;
        String[] result = {"(","","","",")"," ","","","","-","","","",""};
            for(int j = 0; index < userInput.size() ; j++){
                if (result[j] == ""){
                    result[j] = String.valueOf(userInput.get(index));
                    index++;
                    }
                }

        return String.join("", result);
    }
    // User-submitted solution
    public static String otherCreatePhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(createPhoneNumber(arr));
    }
}
