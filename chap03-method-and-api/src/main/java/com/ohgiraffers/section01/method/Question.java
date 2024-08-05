package main.java.com.ohgiraffers.section01.method;

import java.sql.SQLOutput;

public class Question {
    public static void main(String[] args){

        /*
        * 만들어 보자.
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드
        * */



        Question que1 = new Question();

        int q1 = que1.question1(1, 2);
        System.out.println(q1);

        int q2 = que1.question2(1, 2);
        System.out.println(q2);

        int q3 = que1.question3(1, 2);
        System.out.println(q3);

        int q4 = que1.question4(1, 2);
        System.out.println(q4);




    }



    /**
     * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드*/
    public int question1(int a, int b){
        return (a+b);
    }
    /**
     * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 뺀 값을 반환하는 메소드*/
    public int question2(int a, int b){
        return (a-b);
    }
    /**
     * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 곱한 값을 반환하는 메소드*/
    public int question3(int a, int b){
        return (a*b);
    }
    /**
     * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드*/
    public int question4(double a, double b){
        double c = a/b;
        return (int)(c);
    }

}
