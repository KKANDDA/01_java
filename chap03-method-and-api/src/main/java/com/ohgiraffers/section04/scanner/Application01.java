package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        /*
        * java.util.scanner
        * 콘솔 화면에 값을입력 받는 기능을 제공한다.
        *
        * */

        // 정수

        Scanner scr = new Scanner(System.in);

        System.out.println("이름을 입력해 주세요 : ");
        String name = scr.nextLine(); // scr.nextLine(); 엔터를 만나기 전까지를 담는다.
        System.out.println("안녕하세요 " + name + "님!");

        System.out.println("나이를 입력해 주세요 : ");
        int age = scr.nextInt();
        System.out.println("입력하신 나이가 " + age + "세가 맞으세요?");

        System.out.println("금액을 입력해 주세요 : ");
        long lnum =scr.nextLong();
        System.out.println("입력하신 long : " + lnum);

        // 실수

        System.out.println("원하는 실수를 입력해 주세요 : ");
        double number = scr.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");

        // 논리형
        System.out.println("true or false 입력");
        boolean isTrue = scr.nextBoolean();
        // System.out.println((isTrue == true)? "참이다." : "거짓이다.");

         if(isTrue) {
             System.out.println("참이다.");
         } else{
             System.out.println("거짓이다.");
         }


        scr.nextLine(); // 앞서 사용한 nextLine 를 닫아주어야 다음에 사용할 수 있다.

        // 문자형 값 입력

        System.out.println("아무 문자나 입력해 주세요 : ");
        char charValue = scr.nextLine().charAt(0);
        System.out.println(charValue);
    }
}
