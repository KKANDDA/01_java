package main.java.com.ohgiraffers.section02.animal.mammal.rabbit;

import main.java.com.ohgiraffers.section02.animal.mammal.Rabbit;

public class RabbitFarm<T extends Rabbit/*래빗을 포함한 래빗의 자손들만 들어올 수 있다.*/> {
    /*public class RabbitFarm<T extends Rabbit & Animal>*/

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
