package com.practice;

public class Application11 {

    public static void main(String[] args) {
        Application11.method();

    }
    public static void method(){
        int random = (int) (Math.random() * 114)+(-35);
        System.out.println("-35 ~ 78 까지의 난수 발생 = " + random);

    }

}
