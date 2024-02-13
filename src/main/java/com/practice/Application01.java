package com.practice;

import java.util.Scanner;

public class Application01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int sum = first + second;
        int minus = first - second;
        int multiple = first * second;
        int div = first / second;
        int remainder = first % second;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(div);
        System.out.println(remainder);
    }

    }

