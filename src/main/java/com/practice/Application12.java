package com.practice;

import java.util.Scanner;

public class Application12 {

    public static void main(String[] args) {

        System.out.print("정수를 하나 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0){
            System.out.println("양수다. ");

        } else {
            System.out.println("음수다.  ");
        }


        System.out.print("정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();

        if (num1 % 2 != 0){
            System.out.println("홀수다. ");

        } else {
            System.out.println("짝수다. ");

        }
    }



}
