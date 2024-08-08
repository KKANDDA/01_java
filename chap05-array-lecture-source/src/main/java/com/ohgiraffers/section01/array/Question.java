package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Question {
    // 트럼프 카드를 랜덤으로 한 장 출력해 보자

    /*
     * 트럼프 카드는 4 * 13 = 52장으로 구성되어있다.
     * Math.random 을 사용해보자 또는 Random 클래스를 사용해 보자.
     *
     * 배열로 4개의 문양을 선언 및 할당하고, 13개의 숫자를 선언 및 할당해 보자.
     * 그렇게 만들어진 2개의 배열을 for 문을 통해 합쳐준다.
     *
     *
     * 문자열로 트럼프 카드를
     *
     * */


    public static void main(String[] args) {

        Random random = new Random(); // Random 클래스에서 import 하여 클래스를 불러왔다.
        random.nextInt();

        String[] trumpShape = {"스페이드", "하트", "클로바", "다이아몬드"};
        String[] trumpNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};

        int aTurn = random.nextInt(4);
        int bTurn = random.nextInt(12);

        System.out.println(trumpShape[aTurn] + trumpNum[bTurn]);






    }



}
