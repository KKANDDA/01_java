package main.java.com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() {
        super(); // 생략되어있다.
        System.out.println("car 클래스의 기본 생성자 호출됨.");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵빵~~");
        }else{
            System.out.println("주행중이 아니라 경적이 울리지 않습니다.");
        }
    }
    public boolean isRunning(){
        return runningStatus;
    }
    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
