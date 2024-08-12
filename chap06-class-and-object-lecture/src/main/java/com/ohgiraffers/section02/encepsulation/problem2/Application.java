package main.java.com.ohgiraffers.section02.encepsulation.problem2;



public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근하는 경우 생기는 문제점 (2)

        /*Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미라";
        monster3.hp = 400;

        System.out.println("monster1 = " + monster1.name);
        System.out.println("monster2 = " + monster2.name);
        System.out.println("monster3 = " + monster3.name);*/

        // 결합도가 높은 코드는 유지보스에 불리하다. 비용이 많이 든다. // name 못 찾는다. kind 로 변경했기에..

    }
}
