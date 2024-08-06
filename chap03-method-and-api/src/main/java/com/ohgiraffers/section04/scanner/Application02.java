package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args){


        /*
        * nextLine() : 공백을 포함한 한 줄을 입력. 개행문자(엔터, 줄바꿈) 전까지 읽어서 반환 // 공백문자를 포함한다.
        * next() : 공백문자(스페이스바, 띄어쓰기)나 개행문자 전까지를 읽어서 반환 // 공백문자를 포함하지 않는다.
        *
        * */

        Scanner scr = new Scanner(System.in);
        System.out.println("값을 입력해 주세요 : ");
        String greeting = scr.nextLine();
        System.out.println(greeting);

        System.out.println("두 번째 값을 입력해 주세요 : ");
        String greeting2 = scr.next();
        System.out.println(greeting2);


    }
}
