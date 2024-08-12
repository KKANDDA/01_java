package main.java.com.ohgiraffers.section02.encepsulation.problem1;

public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근하는 경우 발생할 수 있는 문제점(1)

        // 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다.

        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1. name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200; // 잘 못된 값이 입력되도 대응할 수 없다.

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        // 몬스터3의 정보
        Monster monster3 = new Monster();
        monster3/*클래스명*/.name/*전역변수명 = 필드명*/ = "드라쿨라";
        monster3.setHp(200/*전달인자*/);

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);

        // 몬스터4의 정보
        Monster monster4 = new Monster();
        monster4.name = "프랑켄";
        monster4.setHp(-200); // 음수!!!!!!!!!!!!

        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp); // 음수가 들어왔지만 hp 가 0으로 출력된다.

    }
}
