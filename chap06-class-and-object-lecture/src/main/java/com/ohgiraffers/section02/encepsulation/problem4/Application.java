package main.java.com.ohgiraffers.section02.encepsulation.problem4;

public class Application {
    public void main(String[] args){

        // 접근제어자에 대해 이해하고 직접 필드에 접근하지 못하게 강제화 할 수 있다.

        Monster monster1 = new Monster();
        /*monster1.kind = "프랑켄"; // 공간은 있으나 접근 할 수 없다. 캡슐화!!!!!!!!!!!!!!
        monster1.hp = 200;       // 기본적으로 캡술화를 한다. 특별한 이유가 없다면 반드시 게터 세터!!!!!!!!!!!!

        monster1.setKind("프랑켄"); // 이렇게 접근해야지!!!!!!!!!!! 기본은 한다 말할 수 있는 거시다..
        monster1.setHp(200);
        System.out.println(monster1.getInfo());

        /*
        * 캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고
        * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
        * 클래스 작성 시 특별한 목적이 아닌 이상 캡술화가 기본 원칙으로 사용되고 있다.
        *
        * */

    }
}
