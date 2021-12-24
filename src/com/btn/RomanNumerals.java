package com.btn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RomanNumerals{
    public static String thousands(int input){
        return addToArr(input,"M");
    }
    public static String hundreds(int input){
        String result = "";
        if (input == 4){
            result = "CD";
            input-=4;
        } else if (input == 9){
            result = "CM";
            input-=9;
        } else if (input > 4){
            result+="D";
            input-=5;
        }
        if (input>0){
            result+=addToArr(input,"C");
        }
        return result;
    }
    public static String tens(int input){
        String result = "";
        if (input == 4){
            result = "XL";
            input-=4;
        } else if (input == 9){
            result = "XC";
            input-=9;
        } else if (input > 4){
            result+="L";
            input-=5;
        }
        if (input>0){
            result+=addToArr(input,"X");
        }
        return result;
    }
    public static String singles(int input){
        String result = "";
        if (input == 4){
            result = "IV";
            input-=4;
        } else if (input == 9){
            result = "IX";
            input-=9;
        } else if (input > 4){
            result+="V";
            input-=5;
        }
        if (input>0){
            result+=addToArr(input,"I");
        }
        return result;
    }

    public static String addToArr(int numOfTimes, String strToAdd){
        ArrayList <String> arr = new ArrayList<>(){};
        for (int i=0;i<numOfTimes;i++){
            arr.add(strToAdd);
        }
        return String.join("", arr);
    }
    public static String solution(int input) {
        if (input < 1){
            return "";
        }
        String convToStr = Integer.toString(input);
        String[] strArr = convToStr.split("");

        List<String> arr = Arrays.asList(strArr);
        String[] resultArr = new String[arr.size()];
        //resultArr:= make([]string, len(arr))

        for (int i = arr.size()-1; i>=0; i--){
            if (i == arr.size() - 1){
                String current = Objects.toString(arr.get(i));
                int num = Integer.parseInt(current);
                resultArr[i] = singles(num);
            } else if (i == arr.size() - 2){
                String current = Objects.toString(arr.get(i));
                int num = Integer.parseInt(current);
                resultArr[i] = tens(num);
            } else if (i == arr.size() - 3){
                String current = Objects.toString(arr.get(i));
                int num = Integer.parseInt(current);
                resultArr[i] = hundreds(num);
            } else if (i == arr.size() - 4){
                String current = Objects.toString(arr.get(i));
                int num = Integer.parseInt(current);
                resultArr[i] = thousands(num);
            }
        }
        return String.join("", resultArr);
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
