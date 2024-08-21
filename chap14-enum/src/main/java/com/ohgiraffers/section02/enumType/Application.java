package main.java.com.ohgiraffers.section02.enumType;


import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {

        // 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리된다. // 하나만 생성, 계속 돌려쓴다.

        Subjects subjects1 = Subjects.JAVA;
        Subjects subjects2 = Subjects.HTML;

        if (subjects1 == subjects2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }else{
            System.out.println("두 과목은 다른 과목입니다.");
        }

        // 단일 인스턴스임을 보장하기에 == 비교가 가능하다. // java1.5 때는 못 하던 것.. (2000년 대 초..)
        System.out.println(subjects1 == Subjects.JAVA);

        // 문자열로 변경하기 쉽다.  // 오버라이드 되어있다. 주소값이 아니고 스트링으로 변형 시켜줬다는 뜻.. (월래 투스링은 주소값..)
        System.out.println(Subjects.JAVA.toString());

        System.out.println("----------");

        // values() 를 이용해서 상수값 배열을 반환하고 이를 연속 처리할 수 있다.
        Subjects[] subjects = Subjects.values();
        for(Subjects s : subjects){
            System.out.println(s);
        }

        System.out.println("----------");

        // 타입 안전성을 보장한다.
        printSubject(Subjects.HTML);

    }

    public static void  printSubject(Subjects subject){
        System.out.println(subject.toString());
    }

}
