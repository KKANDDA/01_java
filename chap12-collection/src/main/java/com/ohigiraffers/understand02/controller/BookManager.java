package main.java.com.ohigiraffers.understand02.controller;

import main.java.com.ohigiraffers.understand02.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookManager {
    public BookManager() {
        // 기본 생성자
        // -> ArrayList<BookDTO> 인스턴스 생성
        ArrayList<BookDTO> book = new ArrayList<>();
    }
    public void addBook(BookDTO book){
        // 전달 받은 BookDTO 객체를
        // 생성자 시 선언한 ArrayList 객체에 추가
    }



    public void deleteBook(int index){
        // 전달 받은 도서 번호로 ArrayList 안에 있는 정보 삭제
    }



    public int searchBook(String title){
        // 전달 받은 도서 제목으로 도서를 검색하고 결과값 반환
    }



    public void displayAll(){
        // 도서 목록 전체 출력
    }



    public ArrayList<BookDTO> sortedBookList(int select){
        // 전달 받은 번호를 기준으로 해당 카테고리순으로 정렬해서
        // ArrayList<BookDTO> 에 담아서 리턴
    }


    public void printBookList(ArrayList<BookDTO> br){
        // 전달 받은 ArrayList<BookDTO> 를
        // 향상된 for 문을 이용하여 출력
    }
}
