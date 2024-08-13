package main.java.com.ohgiraffers.section08.variable;

public class KindsOfVariable {
    // 전역변수 - 필드
    private int globalNum; // 생성자가 필수

    // 클래스변수(정적필드 스태틱!!!)
    private static int staticNum; // 생성자가 없어도 사용할 수 있다. 이미 스태틱에 올라와 있기에..


    public void  testMethod(int num/*매개변수도 일종의 지역변수다.*/){
        // 지역변수
        int localNum = num;

        // 매개변수는 호출시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.
        System.out.println(globalNum/*필드*/);
        System.out.println(staticNum);
    }

    public void testmethod2(){
        System.out.println(globalNum);
        System.out.println(staticNum);
         // System.out.println(num/*지역변수*/); // 지역변수는 해당 스코프 내에서만 사용가능하기 때문에 여기선 쓸 수 없다.
    }
}
