package main.java.com.ohgiraffers.section03.uses;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN; // ; 으로 닫아서 밑으로 메소드나 생성자 따위를 만들 수 있다.

    // Enum 은 상수 하나하나가 인스턴스화 된다.
    private UserRole1(){
        // System.out.println("기본 생성자 호출됨"); // 네 개가 호출된다.
    } // 생성자를 가질 수는 있으나 쓸 수는 없다. private 가 생략되어있다.
    // enum 타입은 고정된 상수들의 집합으로, 런타임 시가 아닌 컴파일 시에 모든 값이 결정되어 있어야 한다.

    // 필요한 경우 메소드도 만들 수 있다.
    public String getNameToLowerCase(){
        return this.name().toLowerCase(); // 소문자로 만들어 주는 작업..
    }

}
