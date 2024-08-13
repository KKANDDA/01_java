package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args){
        /*
         * non stactic methods 호출 방법
         * (메소드가 들어있는 클래스명) (사용할 이름) = new (클래스명());
         * 사용할 이름. 메소드명();
         * Application01 app1 = new Application01(); /// 예시 ///
         * app1.methodA();
         * */
        System.out.println("main() 메소드 호출됨..");

        Application02 app2 = new Application02(); // 사용할 클래스에 이름 부여하기.
        int a = app2.methodA(5554454, 6546541);
        /* app2라는 이름으로 클래스를 부르고 . 으로 이어서 해당 클래스 안의 methodA 라는 매소드를 불러 a라는 변수로 대입했다.
        * 그리고 해당 메소드는 매개변수를 가지고 있기에, 해당하는 자료형에 맞는 전달인자를 입력해 주었다.
        * 그래서 마지막에 리턴값이 출력되는 것을 볼 수 있다. */

        System.out.println(a); // methodA 를 시스템 아웃으로 a 라는 변수에 담아서 출력했다.

        app2.methodA(45,69); // a 변수없이 바로 불러냈다.

        app2.methodB(); //

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
