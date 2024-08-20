package main.java.com.ohigiraffers.understand02.dto;

import java.util.Comparator;

public class BookDTO implements Comparator {
    private int bNo ;
    private int category ;
    // 필드 값 문자열 합친 후 리턴
    //category 분류 별로 출력
    //>> 1 : 인문 / 2 : 자연과학
    //3 : 의료 / 4 : 기타
    private String title ;
    private  String author ;

    public BookDTO() {
    }

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


}
