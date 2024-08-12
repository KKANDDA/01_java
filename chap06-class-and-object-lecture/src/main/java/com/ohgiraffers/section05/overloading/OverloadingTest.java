package main.java.com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    //오버로딩에 대해 이해할 수 있다.

    /*
    * 오버로딩의 사용 이유
    * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우가 종종 있다.
    * 이 때 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기가 매우 어려워진다.
    * 규모가 작은 프로그램의 경우는 정도가 덜 하지만, 규모가 거대해 지면
    * 메소드 또한 관리하기가 매우 어렵다. 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 관리하기 위해
    * 사용하는 기술을 오버로딩이라고 한다.
    *
    * */
    public static void main(String[] args) {
        System.out.println(); // println() 제일 대표적인 오버로딩 기술.. 하나의 자료명으로 여러 것들을 커버
    }
    /*
    * 오버로딩의 조건
    * 동일한 이름을 가진 메소드의 파라메터 선언부에 매개변수의 타입, 갯수, 순거를 다르게 작성하여
    * 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
    * 메소드의 시그니쳐가 다르면 다른 메소드로 인식하기 때문이다.
    * 즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오보로딩이 성립된다.
    *
    * 시그니쳐? 메소드의 메소드명과 파라미터 선언부 부분.
    * public void method(int num){} -> method(int num) 부분
    *
    * */

    public void test(){}
    // public void test(){} // test() 시그니쳐가 동일. 이름이 같아야 하니 파라메터가 달라야 오버로딩이 된 것이다.
    // private void test(){} // 접근제한자(private)는 시그니쳐가 아니니 오럽로딩이 아님다.

    public void test(int a){}
    public void test(int a, int b){}
    public void test(int a, int b, int c){}
}
