package com.practice;

import java.util.Scanner;

public class Application13 {

    public static void main(String[] args) {

        System.out.print("1~10 사이의 정수 한 개를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if (num<10 && num >1){
            if (num % 2 != 0){
                System.out.println("홀수다. ");

            } else if (num % 2 ==0) {
                System.out.println("짝수다. ");

            }

        } else{
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }

    }
    }
