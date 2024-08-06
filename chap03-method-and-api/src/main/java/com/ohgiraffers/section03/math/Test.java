package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        // 원하는 난수를 발생기키는 방법
        // Math.random() -> 0~0.9999999999999.. 사이 값을 랜덤으로 생성
        //0~9 , 1~10 난수를 발생시켜 보자

        int randomZeroToNine = (int)(Math.random()*10);
        int randomOneToTen = (int)(Math.random()*10)+1;

        System.out.println("0~9 난수 : " + randomZeroToNine);
        System.out.println("1~10 난수 : " + randomOneToTen);

        //Random 클래스를 사용해 만들 수도 있다. 다만 Random 클래스는 import 를 해주어야 한다.
        Random rand = new Random(); // 객체부여를 해야함.

        int randomZeroToNine02 = (rand.nextInt(10));
        int randomOneToTen02 = (rand.nextInt(10)+1);

        System.out.println("0~9 난수 : " + randomZeroToNine02);
        System.out.println("1~10 난수 : " + randomOneToTen02);

    }
}
