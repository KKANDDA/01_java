package section04.overflow;

import java.sql.SQLOutput;

public class Application01 {
    public static void main(String[] args) {





        /*
        * 자료형 별 최대 범위를 벗어 나는 경우
        *
        * */

        /*
        * 1byte sms 8개의 bit를 가지고 있음.
        * 127을 2진수로 변환하면 01111111 (8자리)
        * -128은 2진수로 변환하면 10000000 (8자리)
        *
        *
        *
        * */

        byte num1 = 127;

        System.out.println("num1 : " + num1);
        num1++;

        System.out.println("nim1 : " + num1);


        // 언더 플로우
        // 오버플로우와 반대되는 개념

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--;

        System.out.println("num2 : " + num2);



        int firstNum = 10000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;

        System.out.println(multi);


        long multi2 = (long)firstNum*secondNum; // (long) 형변환이 필수, int 수준에서 플로우가 발생됨.
        System.out.println(multi2);




    }
}
