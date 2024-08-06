package main.java.com.ohgiraffers.section04.scanner;



public class Qestion {

/*
* -100 ~ 100 사이의 난수를 발생 시켜서 인자로 전달하면
*   매개변수가
*       양수면서 짝수면 x는 양수면서 짝수입니다.
*       양수면서 홀수면 x는 양수면서 홀수입니다.
*       음수면서 짝수면 x는 음수면서 짝수입니다.
*       음수면서 홀수면 x는 음수면서 홀수입니다. 를 반환하는 메소드를 다른 클래스에 생성해 메인 메소드에서 호출한 후 화면에 출력해 보자
*
* (static / non-static 한 번씩)
*
* */



    public static void main(String[] args){

        RandomNumber ran = new RandomNumber();

        System.out.println(ran.random(1)); // static 없는 거, 객체명으로 호출
        System.out.println(RandomNumber.random2(1)); // static 있는 거, 클래스명.메소드명으로 호출
    }

}
