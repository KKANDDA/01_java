package main.java.com.ohgiraffers.section08.singleton;

public class LazySingleton {
    public static LazySingleton lazy;

    private LazySingleton(){
        System.out.println("lazy 생성됨");
    }

    public static LazySingleton getInstance(){
        if(lazy == null){
            System.out.println("lazy 가 null");
            lazy = new LazySingleton(); // 인스턴스가 생성된 적이 없으면 최초에 만들어 주고
        }
        System.out.println("lazy 가 null 이 아님"); // 있으면 비어있지 않다고 말하는 것.
        return lazy;
    }

}

