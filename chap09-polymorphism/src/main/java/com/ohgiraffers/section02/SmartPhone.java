package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product {

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 추상메소드를 호출함");
        // 상속 받았다...
    }
    public  void  printSmartPhone(){
        System.out.println("smartPhone 의 print 메소드를 호출함");
    }
}
