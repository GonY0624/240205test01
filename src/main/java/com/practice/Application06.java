package com.practice;

public class Application06 {

    public static void main(String[] args) {

        /* 필기. 내가 가지고 있는 사과의 갯수는 92개이다.
            이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
            아래에 알맞은 코드를 넣으시오.
        * */

        int numOfApples = 92;
        int sizeOfBucket = 10;

        int numOfBucket = (numOfApples/sizeOfBucket) + ((numOfApples%sizeOfBucket)<10 ? 1:2); //여기에 들어갈 말은?

        System.out.println("필요한 바구니의 수 : " + numOfBucket);  //-> 10


    }

}
