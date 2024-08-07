package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class MarkerGrader {
    public void makerGrader(){

        Average average = new Average();
        Scanner scr = new Scanner(System.in);

        System.out.println("세 과목의 점수를 각각 하나씩 입력해 주세요.");

        double a = scr.nextDouble();
        double b = scr.nextDouble();
        double c = scr.nextDouble();

        if((average.average(a, b, c) >= 60) && (a >= 40) && (b >= 40) && (c >= 40)){
            System.out.println("귀하는 합격입니다.");
        }else{
            System.out.println("불합격입니다.");
        }

            /* if(average.average(a, b, c) < 60){
            System.out.println("귀하는 불합격입니다.");
        }else if(a < 40){
            System.out.println("귀하는 불합격입니다.");
        }else if(b < 40){
            System.out.println("귀하는 불합격입니다.");
        }else if(c < 40){
            System.out.println("귀하는 불합격입니다.");
        } */
    }

}
