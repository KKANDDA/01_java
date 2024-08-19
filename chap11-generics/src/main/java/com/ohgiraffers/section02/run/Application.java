package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.animal.mammal.Rabbit;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.RabbitFarm;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.rabbitFarm.Bunny;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.rabbitFarm.DrunkenBunny;

public class Application {
    public static void main(String[] args) {

        /*
        * 제네릭 클래스 작성 시 extends 키워드를 사용하면 특정 타입만 사용하도록 제한을 걸 수 있다.
        * */

        // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        // RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
        // RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny()); // 자동 형변환. 런터임시 오류를 컴파일선에서 잡을 수 있다. 동적바인딩의 안정성.. 월래는 형변화 해서 했던 것..
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();


    }
}
