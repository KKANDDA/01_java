package main.java.com.ohgiraffers.section08.singleton;

public class EagerSinglerton {

    private static EagerSinglerton eager = new EagerSinglerton(); // 인스턴스를 넘겨주기 위해선.. get 을 이용한다.

    private EagerSinglerton() {}

    public  static EagerSinglerton getInstance(){
        return eager; // get 으로 이미 올라간 객체를 호출해서 사용.
    }
}
