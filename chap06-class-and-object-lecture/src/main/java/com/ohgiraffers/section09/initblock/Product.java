package main.java.com.ohgiraffers.section09.initblock;

public class Product {


    // 1. 명시적 초기화

    private String name = "갤럭시";
    private int price = 10000000;
    private static String brand = "삼성";

    public Product() {
        System.out.println("기본 생성자 호출됨");
    }

    {

    name ="아이폰";
    price =15000000;
    brand = "애플";
        System.out.println("인스턴스 초기화 블럭");
}
    //매개변수 있는 생성자
    // 위에서 초기화된 값을 다 무시하고 생성자에 작성한 초기화 내용으로 인스턴스 초기화
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출");

    }

    static { // 정적 초기화는 한 번만 진행된다.
        // name = "아이폰"; // 네임(일반 필드)는 스태틱 초기화 내에서 변경할 수 없다.
        brand = "엘지";
        System.out.println("정적 초기화 블록 실행");

    } // 정적 필드에선 정적 변수만 변경 가능하다.

    @Override // 알트 + 인설트 > 투스트링 // 스태틱 필드는 안 되니 추가하여 준다.
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand +
                '}';
    }
}
