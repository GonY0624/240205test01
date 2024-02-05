package com.practice;

public class Application04 {

    public static void main(String[] args) {

        double korea = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int) (korea+math+english);
        int pyungun = (int)((korea+math+english)/3);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + pyungun);

    }

}
