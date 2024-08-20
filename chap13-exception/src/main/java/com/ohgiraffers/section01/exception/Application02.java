package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args) {

        // try-catch 를 이용한 예외 처리

        ExceptionTest et = new ExceptionTest();


        try{
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(10000, 5000); // 에러 발생시에만 캐치로 보냄
            System.out.println("--- 상품 구입 가능 ---");  // 에러가 났으니 이 문구는 출력하지 않는다.
        }catch (Exception e){ // 에러가 나지 않으면 이쪽으로 이동하지 않는다.
            System.out.println("money 가 price 보다 작읍니다.");
            e.printStackTrace(); // 에러 코드를 출력해 준다.

        }
        System.out.println("프로그램 종료");

    }
}
