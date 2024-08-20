package main.java.com.ohgiraffers.understand;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
         * 사용자에게 숫자 두 개와 연산자를 입력 받습니다.
         * 입력된 연산을 수행하여 결과를 출력합니다.
         * / 는 0 으로 할 수 없기 때문에 예외처리 해주시고
         * 사용자가 잘못된 연산자를 입력하면 예외처리 해주세요.
         * */

        /*try {

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류 발생");
        }*/

        Scanner scr = new Scanner(System.in);
        System.out.println("지금 부터 시작, 첫 번째 숫자 입력");
        int num1 = scr.nextInt();
        scr.nextLine();

        while (true) {
            System.out.println("연산자 기호 입력");
            String operatorSymbol = scr.nextLine();

            /*try {
                if (!operatorSymbol.equals("+") && !operatorSymbol.equals("-") && !operatorSymbol.equals("*") &&
                        !operatorSymbol.equals("/") && !operatorSymbol.equals("%")) {
                    throw new Exception("지금 입력한 거 연산자 기호 맞어?!!!! 야이 씨부럴 놈아");
                }
            } catch (Exception wrongOperatorSymbol) {
                System.out.println("오류 발생");
                wrongOperatorSymbol.printStackTrace();
                return;
            }*/

            System.out.println("두 번째 숫자 입력");
            int num2 = scr.nextInt();

            System.out.println("... ... . 지금 계산 중");
            int result = 0;

            try {
                switch (operatorSymbol) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new Exception("지금 이거 시부럴 에러여!!! 0은 안 돼!!!!!!!!!!!!!!");
                        }
                        result = num1 / num2;
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                    default:
                        System.out.println("잘 못된 기호 사용으로 보입니다."); continue;
                }
            } catch (Exception e) {
                System.out.println("오류발생");
                e.printStackTrace();
            }


            // int result = (num1) + 연산자기호 + (num2);


        }
    }
}
