package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application03 {
    public static void main(String[] args) {


        /*
        * Object클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의 하는 경우 반드시 hashCode() 도 재정의 하도록 되어 있다.
        * 만약 hashCode() 를 재정의 하지 않으면 같은 값을 가지는 동등객체는 같은 해쉬코드 값을 가져야 한다는 규약에 위반하게 된다.
        * (강제성은 없지만 규약대로 하는 게 좋다)
        *
        *
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode()" + book1.hashCode());
        System.out.println("book2.hashCode()" + book2.hashCode());

        // hashCode() 를 재정의 하지 않았을 때 문제점

        Map<Book, String> map = new HashMap<>();

        map.put(new Book(1, "홍길동전", "허균", 50000)/*키*/, "selled"/*밸류*/); // 같은지 비교할 때는 해쉬코드를 읽는다.

        String str = map.get(new Book(1, "홍길동전", "허균", 50000)); // 키를 넣어서 밸류[selled]를 받는다. 제목을 이용해서 내용을 꺼낸다.
        // new 로 각각의 객체로 들어있기에 동등객체이다. 주소값을 동등하게 봐꿔서 원하는 값을 받아냈다.

        System.out.println(str);

    }
}
