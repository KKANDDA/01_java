package main.java.com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    // 필드
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;


    // 기본 생성자
    public BookDTO(){}

    // 필드 3가지를 초기화 하는 생성자
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    // 모든 필드를 초기화 하는 생성자 작성
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }


    // setter & getter


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }


    // + printInformation():void
    public void printInformation(){
        System.out.println(title +" "+ publisher +" "+ author+" "+ price+" "+ discountRate);
    }

    /*null, null, null, 0, 0.0
    자바의 정석, 도우출판, 남궁성, 0, 0.0
    홍길동전, 활빈당, 허균, 5000000, 0.5*/






}
