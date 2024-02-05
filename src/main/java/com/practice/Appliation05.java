package com.practice;

public class Appliation05 {

    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); //true (0)
        System.out.println(y += 10 - x++);            //13   (0)
        System.out.println(x+=2);                     //4    (X)
        //점점 값이 축적이 되기 때문에 위에서 x++연산 때문에 x=3이고 x+2=5이므로 닶은 5가 나온다(이해 완료)
        System.out.println( !('A' <= c && c <='Z') ); //true (X)
        //앞에 !가 있기때문에 false (이해 완료)
        System.out.println('C'-c);                    //2    (0)
        System.out.println('5'-'0');                  //     (X)
        //이것은 그냥 숫자라고 받아들이면 됨. 그렇게 떄문에 5-0=5(이해 완료)
        System.out.println(c+1);                      //A+1  (X)
        //문자보다 숫자가 더 크기 떄문에 숫자에 흡수가 되어 65+1=66(이해 완료)
        System.out.println(++c);                      //66   (X)
        //전위연산자로 하나가 더해져서 B가 나온다
        System.out.println(c++);                      //66   (X)
        //후위연산자로 B에서 하나가 더해져서 C가 나오지만 값은 아직 B
        System.out.println(c);                        //A    (X)
        //앞의 후위 연산자에서 계산된 값으로 C가 나오게 된다.
        System.out.println();                          // 의 결과를 예측하고 이유를 설명하시오.

    }

}
