package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application02 {
    public static void main(String[] args) {

        /*
        *
        * equals() 메소드 오버라이딩
        * equals() 메소드는 매개변수로 전달 받은 인스턴스와 == 연산하여
        * true or false 를 반환한다.
        * 즉 동일한 인스턴스인지 비교하는 기능을 한다.
        *
        * 동일객체와 동등객체
        * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
        * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동듣객체 라고 한다.
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000); // 동등객체를 만들기 위한 준비..
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        System.out.println(book1.equals(book2)); // 오버라이딩을 통해서 주소값이 다른 객체를 같도록 인식시켜 주어야 한다.

    }
}
