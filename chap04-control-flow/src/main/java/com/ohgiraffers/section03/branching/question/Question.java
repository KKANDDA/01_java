package main.java.com.ohgiraffers.section03.branching.question;

public class Question {
    public static void main(String[] args) {

        /*
        * 자판기를 만들어 보자.
        * 자판기가 파는 음료는 사이다(500) 콜라(600) 환타(700) 박카스(1000) 핫식스(1500)
        * 잘목된 음료수가 선택되면 다시 받아야 한다.
        *
        * 음료수를 선택하면 계산 여부를 물어본 후계산을 고르면 총 금액과 고른 음료수를 출력해 주어야 한다.
        *
        * 예시)
        * 음료를 선택해 주세요.
        *
        * 사이다
        * 사이다를 선택하셨습니다.
        * 계산하시겠습니까?
        * 네                                         아니요
        * 총 상품은 사이다                             음료를 더 선택해 주세요
        * 총 금액은 500원 입니다.                      콜라
        *                                           콜라를 선택하셨습니다.
        *                                           계산하시겠습니까?
        *                                           네
        *
        * */

        BendMachine bendMachine = new BendMachine();
        bendMachine.machine2();
    }
}
