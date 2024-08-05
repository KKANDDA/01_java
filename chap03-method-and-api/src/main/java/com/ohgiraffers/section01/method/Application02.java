package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args){

        System.out.println("main() 메소드 호출됨..");
        /*
        * non stactic methods 호출 방법
        * (메소드가 들어있는 클래스명) (사용할 이름) = new (클래스명());
        * 사용할 이름. 메소드명();
        * Application01 app1 = new Application01(); /// 예시 ///
        * app1.methodA();
        * */

        Application02 app2 = new Application02();
        int a = app2.methodA(5554454, 6546541);
        System.out.println(a);
        app2.methodB();
        System.out.println("main() 메소드 종료됨");

    }

    public int methodA(int a, int b){
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
        return (a+b);
    }

    public void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨");
        System.out.println("methodC() 종료됨");
    }
}
