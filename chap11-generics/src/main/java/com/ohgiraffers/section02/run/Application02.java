package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.animal.mammal.Rabbit;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.RabbitFarm;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.rabbitFarm.Bunny;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.rabbitFarm.DrunkenBunny;
import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.WildCardFarm;

public class Application02 {

    public static void main(String[] args) {


        /*
        * 와일드카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        *
        * <?> : 제한 없음
        * <? extends Type> : 와일드 카드의 상한을 제한함. (자신 포함 하위만 사용 가능)
        * <? super Type> : 와일드 카드 하한 제한 (자신 포함)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();


        // 1. anyType
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny())); // 농장을 생성할 수 있어야 생성 가능

        // 2. extendsType
        // wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        // 3. superType
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        // wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        // 슈퍼타입은 부모에 드렁큰이 있기는 있기때문에, 동적바인딩이 일어나서, 타입을 정해줘야 컴파일러가 잡는다..

    }
}
