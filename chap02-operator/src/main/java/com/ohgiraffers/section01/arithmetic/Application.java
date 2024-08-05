package main.java.com.ohgiraffers.section01.arithmetic;

public class Application {
    public static void main(String[] args) {


        /*
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서 가장 많이 사용되는 연산자 이다.
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수다 두 개인 이항 연산자로 분류되며
        * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        *
        * 산술 연사자의 종류
        * +
        * -
        * *
        * /
        * %
        *
        * 우선순위는 알고 있는 수학과 동일하다.
        *
        * */

        int num1 = 20;
        int num2 = 7;


        System.out.println("num1 + num2 = " + num1 + num2); // 문자열은 사칙 연산이 통하지 않는다.
        System.out.println("num1 + num2 = " + (num1 + num2)); // 괄호를 사용하여 정수들을 먼저 더하고 문자열로 바뀌도록 유도한다.
        System.out.println("num1 - num2 = " + (num1 - num2)); // 문자열은 뺄 수 없다.

        System.out.println("num1 * num2 = " + num1 * num2); // 사칙연산의 법칙대로 곱셈 나눗셈, 나머지 연산이 먼저 연산이 되고 문자열로 바뀌었다.
        System.out.println("num1 / num2 = " + num1 / num2);
        System.out.println("num1 % num2 = " + num1 % num2);




    }
}
