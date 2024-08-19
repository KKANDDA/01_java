package main.java.com.ohgiraffers.section02.animal.mammal.rabbit;

import main.java.com.ohgiraffers.section02.animal.mammal.rabbit.rabbitFarm.Bunny;

public class WildCardFarm {

    // 매개변수로 전달 받는 토끼 농장을 구현할 때 사용할 타입변수에 대해 제한할 수 있다.

    public void anyType(RabbitFarm<?> farm){

        farm.getAnimal().cry();
    }

    public void extendsType(RabbitFarm<? extends Bunny/*추가 제한. 자식과 자식 밑으로..*/> farm){
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny/*추가 제한, 자식과 자식 위로..*/> farm){
        farm.getAnimal().cry();
    }


}
