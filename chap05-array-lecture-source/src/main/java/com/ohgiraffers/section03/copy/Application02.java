package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args) {

        // 얕은 복사를 활용해 매개변수와 리턴값으로 활용해 보자

        String[] names = {"홍길동", "유관순","이순신"};
        System.out.println(names.hashCode());
        print(names); // names 와 args 가 같다.

        String[] animals = getAnimals(); // anmimals 변수에 에 getAnimals 리턴값의 주소를 담았다.

        System.out.println("animals.hashCode(): " + animals.hashCode());

        print(animals); // anmimals 변수에 에 getAnimals 를 복사했다.



    }

    public static void print(String[] args/*매개변수(하지만 args 는 전달인자다. 여기선 전달된 인자로 이해하면 편할 듯 하다.)*/){
        System.out.println(args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "");
        }
        System.out.println();
    }
    public static String[] getAnimals() {
        String[] animals = {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals.hashCode() = " + animals.hashCode());

        return animals;
    }



}
