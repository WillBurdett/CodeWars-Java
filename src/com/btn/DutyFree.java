package com.btn;

public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int)(Math.floor(hol / ((double)normPrice / ((double)100/discount))));
    }

    public static void main(String[] args) {
        System.out.println(dutyFree(17,10,500));
    }
}
