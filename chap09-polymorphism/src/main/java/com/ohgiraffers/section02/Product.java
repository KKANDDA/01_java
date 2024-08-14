package main.java.com.ohgiraffers.section02;

public abstract class Product {

    private  int nonDtacticField;
    private  static  int staticField;

    public Product(){
        // 이걸루다가 인스턴스를 만들지는 못한다.
    }
    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonSraticMethod 를 호출함");
    }
    public static void staticMethod() {
        System.out.println("Product 클래스의 SraticMethod 를 호출함");
    }

    public  abstract  void  abstractMethod();

}
