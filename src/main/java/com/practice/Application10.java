package com.practice;

public class Application10 {

    public static void main(String[] args) {

        Application10.method(3690);

    }

    public static void method(int second){


        int min = second/60;
        int min1 = min/60;
        int sec = second%60;
        int hour = min/60;

        System.out.println(hour + "시간" + min1 + "분" + sec + "초");

    }


}
