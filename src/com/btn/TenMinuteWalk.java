package com.btn;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int xAxis = 0;
        int yAxis = 0;
        for (int i = 0; i< walk.length; i++){
            switch (walk[i]){
                case ('n') :
                    yAxis += 1;
                    break;
                case ('s') :
                    yAxis += -1;
                    break;
                case ('e') :
                    xAxis += 1;
                    break;
                case ('w') :
                    xAxis += -1;
                    break;
            }
    }
        if (xAxis == 0 && yAxis == 0 && walk.length == 10) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
}

    public static void main(String[] args) {
    char [] example1 = {'n','s','n','s','n','s','n','s','n','s'};
    char [] example2 = {'w','e','w','e','w','e','w','e','w','e','w','e'};
    char [] example3 = {'w'};
    char [] example4 = {'n','n','n','s','n','s','n','s','n','s'};

    isValid(example2);
    }
}
