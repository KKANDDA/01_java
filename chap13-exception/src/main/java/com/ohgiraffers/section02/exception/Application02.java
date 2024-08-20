package main.java.com.ohgiraffers.section02.exception;

import main.java.com.ohgiraffers.section02.ExceptionTest;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest(); // 객체 생성

        try {
            et.checkEnoughMoney(1000, -500);
        }catch (NotEnoufgMoneyException e){
            e.printStackTrace();
        }catch (PriceNagativeException |/*월래 두 개를 써야하나, 이건 문법이라 하나만 쓴다*/ MoneyNegativeException e){ // 같은 네거티브익셉션을 상속 받았으면 같이 쓸 수 있다.
            e.printStackTrace();
        }finally {
            System.out.println("무조건 마지막에 동작함"); // 어떤 조건이든 무조건 동작함. 에러가 나든 말든..
        }

    }
}
