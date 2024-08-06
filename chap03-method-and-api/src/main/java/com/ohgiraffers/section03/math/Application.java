package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        /*
        * api 란?
        * application programming interface 는 응용프로그램에서 사용할 수 있도록,
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해서 우리가 구현할 수 없거나 구현하기 번거로운 기능들을
        * jdk 를 설치하면 사용할 수 있도록 제공해 놓은 소스코드 (클래스나 인터페이스) 들을 의미한다.
        * 더 쉽게 말해서 누가 작성해놓은 코드를 가져다 쓰는 것이다.
        *
        * */

        /*
        * java.lang.Math
        * Math 클래스는 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해 놓은 클래스이다.
        * 모든 메소드는 static 메소드로 정의되어있다.
        * (객체의 상태를 관리하지 않고 기능만 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법이다.)
        * */

        System.out.println("-7의 절대값 : " + (Math.abs(-7)));
        // 별도의 import 없이도 사용할 수 있다. // import java.lang.Math.*; 이 생략되어 있다. 이것만 예외이다!

        System.out.println("10과 20중 더 작은 것은? : " + (Math.min(10,20)));
        System.out.println("10과 20중 더 큰 것은? : " + (Math.max(10,20)));
        System.out.println("원주율 : " + (Math.PI));

        // 원하는 난수를 발생기키는 방법
        // Math.random() -> 0~0.9999999999999.. 사이 값을 랜덤으로 생성
        System.out.println("난수 발생 : " + (int)(Math.random() * 10)+1); // +1이 없으면 0~9 , +1이 붙어 1~10

        //Random 클래스 사용
        Random random = new Random(); // java.lang.Math 안에 있는 메소드가 아니기 때문에, import 가 필요하다.

        // 0~9까지
        int randomnumber = random.nextInt(10);
        System.out.println(randomnumber);

        // -128~127까지
        int randomnumber1 = random.nextInt(256)-128;
        System.out.println(randomnumber1);

    }
}
