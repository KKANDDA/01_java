package main.java.com.ohgiraffers.section02.understand.employee;

import main.java.com.ohgiraffers.section02.understand.car.Car;
import main.java.com.ohgiraffers.section02.understand.car.ElectricCar;

public class Seller {

    private String name;
    private double result; // 판매수당

    public Seller(String name) {
        this.name = name;
    }

    public void sale(Car[] cars){
        for(Car car : cars){

            if(car instanceof/*지금 들어온 카가 일렉트로닉카이면 참값을 출력*/ ElectricCar){
                ((ElectricCar) car).getEnergy() ;//에너지를 쓰려면 강제 형변환해야 한다. 부모는 자식의 메소드를 가지고는 있지만 사용은 할 수 없다.
                System.out.println(car.getBrand()+"사의 "+car.getName()+"를판매하였습니다.");
                result += car.getPrice(); // 동적바인딩, 프로그램 실행 후 결정한다. 똑같은 getPrice 메소드인데.. // 어느 힙 영역인지?
            }else{System.out.println(car.getBrand()+"사의 "+car.getName()+"를판매하였습니다.");
                result += car.getPrice();

            }

        }
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
