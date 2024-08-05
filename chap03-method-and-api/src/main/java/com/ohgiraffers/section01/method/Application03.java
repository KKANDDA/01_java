package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args){

        /*
        * 전달인자(argument = arge), 매개변수(parameter) 를 이용한 메소드 호출
        *
        *  변수의 종류
        * 1. 지역 변수 // 메소드 내에 존재하는 변수
        * 2. 매개 변수 // 일종의 지역 변수 - 메소드 내부에서만 사용 가능
        * 3. 전역 변수 (필드) // 클래스 안에 존재하며 모든 메소드에 영향을 준다.
        * 4. 클래스(static) 변수
        *
        *
        * 지역변수는 선언한 메소드 블록 내부에서만 사용 가능하다.
        * 이것을 지역변수의 스코프 라고 한다. - {}
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우
        * 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때 전달하는 값을 전달인자 (argument)라고 부르고,
        * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 한다.
        *
        * */

        Application03 app3 = new Application03();

        //호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 갯수, 순서가 일치하게 값을 넣어 호출한다.
        app3.testMethod(20); //(20) 전달인자 아규먼트
        // app3.testMethod(20, 30); // 갯수가 일치하지 않으면 호출할 수 없다.
        // app3.testMethod("30"); // 자료형이 일치하지 않으면 호출할 수 없다.
        // app3.testMethod(); // 매개변수다 있는데 인자로 값을 전달하지 않으면 호출할 수 없다.

        // 변수에 저장한 값 전달
        int age = 20;
        app3.testMethod(age);

        // 자동 형변환을 이용한 값 전달
        byte byteAge = 20; // int 보다 작은 자료형을 사용해야 한다. (short)
        app3.testMethod(byteAge);

        // 강제 형변환을 이용한 값 전달
        long longAge = 30L;
        app3.testMethod((int)longAge);

        // 연산 결과를 이용해서 값 전달
        app3.testMethod(byteAge*30);

    }

    public void testMethod(int age){ // (age) 전달인자 파라메터
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
