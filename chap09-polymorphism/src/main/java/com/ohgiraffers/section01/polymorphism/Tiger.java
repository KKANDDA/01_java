package main.java.com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 다른 동물을 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 달려갑니다.");
    }

    @Override // 부모에게 있는 것을 재정의한다는 뜻의 키워드, 없으면 별도의 메소드가 된다.
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흥!");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯습니다.");
    }
}
