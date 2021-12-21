package com.btn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> dirToList = Arrays.stream(arr).collect(Collectors.toList());
        for (int i = 0; i<dirToList.size() - 1; i++){
            if (dirToList.get(i) == "NORTH" && dirToList.get(i + 1) == "SOUTH"){
                dirToList.remove(i + 1);
                dirToList.remove(i);
            } else if (dirToList.get(i) == "SOUTH" && dirToList.get(i + 1) == "NORTH"){
                dirToList.remove(i + 1);
                dirToList.remove(i);
            } else if (dirToList.get(i) == "EAST" && dirToList.get(i + 1) == "WEST"){
                dirToList.remove(i + 1);
                dirToList.remove(i);
            } else if (dirToList.get(i) == "WEST" && dirToList.get(i + 1) == "EAST"){
                dirToList.remove(i + 1);
                dirToList.remove(i);
            }
        }
        String [] result = dirToList.toArray(new String[dirToList.size()]);
        return result;
    }

    public static void main(String[] args) {
       String [] dirArr = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"};
       dirReduc(dirArr);
    }
}
