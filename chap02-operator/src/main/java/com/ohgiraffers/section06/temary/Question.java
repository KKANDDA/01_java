package main.java.com.ohgiraffers.section06.temary;

public class Question {
    public static void main(String[] args) {

        /*
        * 영어 시험을 본 결과 1번 학생은 90점, 2번학생은 95점, 3번 학생은 81점을 맞았다.
        * 평균을 구한 후 논리 연산자를 이용해 90~100점이면 합격을 출력 아니면 불합격을 출력
        * */

        int st1 = 90;
        int st2 = 95;
        int st3 = 81;

        int result1 = (st1 + st2 + st3) / 3; // 배열을 사용하면 좀 더 쉬울지도..

        System.out.println(result1);
        System.out.println((result1 >= 90)? "합격!!" : "불합격..");

        System.out.println("-----------------------------------------------");

        /*
        * 승객의 놀이기구 탑승 가능 여부를 출력하는 코드를 만들어 주세요. 탑승 기준은 120cm 이상.
        * */

        int passenger1 = 110;

        System.out.println((passenger1 >= 120)? "가능!" : "불가능..");

        System.out.println("-----------------------------");

        /*
        * 시험에 응시한 학생들을 점수 별로 세 그룹으로 묶고 상대 평가를 1~3등급으로 내려달라.
        * 학생1 = 22
        * 학생2 = 56
        * 학생3 = 90
        * 학생4 = 1
        * 학생5 = 99
        * 학생6 = 77
        * 학생7 = 14
        * 학생8 = 100
        * 학생9 = 30
        *
        * */

        int examinee1 = 22;
        int examinee2 = 56;
        int examinee3 = 90;
        int examinee4 = 1;
        int examinee5 = 99;
        int examinee6 = 77;
        int examinee7 = 14;
        int examinee8 = 100;
        int examinee9 = 30;

        int result01 = (examinee8 &  examinee5 & examinee3) ;
        int result02 = (examinee9 + examinee6 + examinee2) ;
        int result03 = (examinee7 + examinee4 + examinee1) ;

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);

        // 무리데스.. ㅠㅠ



    }
}

