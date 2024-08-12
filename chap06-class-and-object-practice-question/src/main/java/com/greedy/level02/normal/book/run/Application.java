package main.java.com.greedy.level02.normal.book.run;

import main.java.com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력

        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();

        BookDTO bookDTO3 = new BookDTO("자바의 정석", "도우출판", "남궁성"); //객체 생성시 값을 넣거나(선언과 초기화가 동시에..)
        bookDTO3.printInformation();
        bookDTO3.setPrice(10000); // 만들고 난 후 세터로 값을 넣거나(초기화) 두가지 방법
        bookDTO3.setDiscountRate(0.5);
        bookDTO3.printInformation();

        BookDTO bookDTOAll = new BookDTO("홍길동전", "활빈당"," 허균", 5000000, 0.5);
    }
}
