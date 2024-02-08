package com.practice;

public class Application09 {

    public static void main(String[] args) {

        Application09.method(880);

    }

    public static void method(int x){
        int ohbaek = (x/500);
        
        int baek = (x-(500*(ohbaek)))/100;
        
        int ohship = (x-((500*ohbaek)+(100*baek)))/50;
        
        int ship = (x - ((500*ohbaek)+(100*baek)+(50*ohship)))/10;

        int sum = ohbaek + baek + ohship + ship;
        System.out.println(sum);


    }

}
