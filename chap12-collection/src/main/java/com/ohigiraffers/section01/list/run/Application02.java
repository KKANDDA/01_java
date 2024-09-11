package main.java.com.ohigiraffers.section01.list.run;

import main.java.com.ohigiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohigiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<BookDTO>();

        /*BookDTO book1 = new BookDTO();
        book1.setNum(6);
        System.out.println(book1.getNum());
        Application03 a3 = new Application03(book1.getNum());*/


        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));



        // Collections.sort(bookList); // 기준을 몰라서 정렬를 못 한다.

        // 정렬 전 책 리스트 출력
        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        /*
        * Comparator 인터페이스를 상속 받아 정렬의 기분을 정해줌.
        * list 의 sort() 메소드의 인자로 정렬 기준이 되는 인스턴스를 넣어주면
        * 우리가 오버라이딩 한 메소드가 동작하게 되며 그것으 정렬 기준으로 삼는다.
        * */
        System.out.println("-------- 가격 오름차순 정렬 ------------");
        bookList.sort(new AscendingPrice());
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        // 책 제목을 기준으로 오름차순
        System.out.println("------- 책 제목 기준 오름차순 ---------");
        bookList.sort(new Comparator<BookDTO>() // 컴퍼레이터 생성자를 호출하였고 <>제네릭으로 클래스를 타입 지정하여 클래스 필드에 접근할 수 있도록 하였다.
        {
            @Override
            public int compare(BookDTO o1, BookDTO o2)
            {
                // compareTo() : 앞의 값이 더 작은 경우 음수 반환
                // 같으면 0, 앞이 크면 양수 반환
                return o1.getTitle().compareTo(o2.getTitle());

            }
        }
        );
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        // 책 제목을 기준으로 내림차순
        System.out.println("------- 책 제목을 기준으로 내림차순 --------");
        bookList.sort(new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getTitle().compareTo(o1.getTitle()); // compareTo()는 String
            }
        });
        for(BookDTO book : bookList){
            System.out.println(book);
        }


    }
}
