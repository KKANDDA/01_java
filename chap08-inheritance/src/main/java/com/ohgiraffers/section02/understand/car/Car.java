package main.java.com.ohgiraffers.section02.understand.car;

public class Car {

    private final String brand;

    private int price;

    private String name;

    public Car(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    // 생성자를 입력받고 더 안 만들 거임. 파이날
}
