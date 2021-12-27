package com.btn;

import java.sql.Time;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
//        if (seconds < 86399) {
//            Time result = new Time(0, 0, seconds);
//            return result.toString();
//        }
        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int mins = remainder / 60;
        remainder = remainder % 60;
        int secs = remainder;

        String strHours = String.valueOf(hours);
        String strMins = String.valueOf(mins);
        String strSecs = String.valueOf(secs);


        if (strHours.length() < 2){
            strHours = "0"+strHours;
        }
        if (strMins.length() < 2) {
            strMins = "0" + strMins;
        }
        if (strSecs.length() < 2) {
            strSecs = "0" + strSecs;
        }
        return strHours+":"+strMins+":"+strSecs;
    }

    //User-Submitted!
    public static String userMakeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
    public static void main(String[] args) {
        System.out.println(makeReadable(5));
    }
}


