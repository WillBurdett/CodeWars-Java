package com.btn;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h < 0 || bounce <= 0 || bounce >= 1 || window >= h){
            return -1;
        }
        int timesSeen = 1;
        double bounceHeight = h;

        while (bounceHeight >= window){
            bounceHeight = bounceHeight * bounce;
            if (bounceHeight > window){
                timesSeen+=2;
            }
        }
        return  timesSeen;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
    }
}
