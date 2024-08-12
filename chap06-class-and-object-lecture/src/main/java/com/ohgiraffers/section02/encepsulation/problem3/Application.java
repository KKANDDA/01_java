package main.java.com.ohgiraffers.section02.encepsulation.problem3;



public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근시 생기는 문제점 (3)

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100/*전달인자*/);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄");
        monster2.setHp(200);

        System.out.println(monster1.getIfo());
        System.out.println(monster2.getIfo());

        System.out.println("--------- 그러나 여전히 필드에 직접 접근할 수 있다. ------");
        Monster monster3 = new Monster();
        monster3.kind = "두치";
        monster3.hp= -500;

        System.out.println("monster3 kind = " + monster3.kind);
        System.out.println("monster3 hp = " + monster3.hp);

    }
}
