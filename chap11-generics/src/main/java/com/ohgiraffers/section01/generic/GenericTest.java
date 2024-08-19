package main.java.com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    private T/*자료형, 타입 기입하는 자리*/ value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
