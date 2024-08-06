package main.java.com.ohgiraffers.section04.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

//        계산기 만들기
//        계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
//        ((예시))
//        첫 번 째 숫자를 입력하세요 :
//        2
//        연산할 기호를 쓰세요 :
//        +
//        두 번 째 숫자를 입력하세요 :
//        2
//        결과는 4입니다

public class Calculator {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요");
        int num1 = scr.nextInt();

        scr.nextLine();

        System.out.println("연산할 기호를 쓰세요");
        char mathSymbol = scr.nextLine().charAt(0);

        System.out.println("두 번째 숫자를 입력하세요");
        int num2 = scr.nextInt();

        int answer = (mathSymbol == '+')? num1 + num2:
                (mathSymbol == '-')? num1 - num2:
                        (mathSymbol == '*')? num1 * num2:
                                (mathSymbol == '/')? num1 / num2: num1 % num2;

        System.out.println("결과는 " + answer + "입니다");



    }
}
