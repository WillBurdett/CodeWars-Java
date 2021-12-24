package com.btn;

import java.util.*;

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

    // user submitted using MAPS
    private static TreeMap<Integer, String> MAP;
    static {
        MAP = new TreeMap<Integer, String>(Collections.reverseOrder());
        MAP.put( 1, "I" );
        MAP.put( 4, "IV" );
        MAP.put( 5, "V" );
        MAP.put( 9, "IX" );
        MAP.put( 10, "X" );
        MAP.put( 40, "XL" );
        MAP.put( 50, "L" );
        MAP.put( 90, "XC" );
        MAP.put( 100, "C" );
        MAP.put( 400, "CD" );
        MAP.put( 500, "D" );
        MAP.put( 900, "CM" );
        MAP.put( 1000, "M" );
    }

    public String othersolution(int n) {
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Integer, String> entry: MAP.entrySet() ){
            int i = entry.getKey();
            String s = entry.getValue();
            while( n>=i ){
                builder.append(s);
                n -= i;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
