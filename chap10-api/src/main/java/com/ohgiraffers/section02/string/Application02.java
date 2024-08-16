package main.java.com.ohgiraffers.section02.string;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton) // 힙 영역 안에 스트링 영역이 따로 있다.
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 ==/*String 은 주소값을 비교한다.*/ str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4); // 투스트링은 16진수로

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode()); // 원래있던 주소값을 10진수로

        str2 += "orcle";

        System.out.println(str1 == str2); // 기존에 있던 것을 새롭게..

        /*
        * equals() : String 클래스의 equals() 메소드는 인스턴스 값을 가지는 경우 ture, 다른 값인 경우 false 를 반환하도록 override 되어 있다.
        *
        * 따라서 문자열 인스턴스 생성 방식과 상관 없이 !!!동일한 문자열!!!!인지 비교하기 위해 == 연산 대신 equals() 메소드를 사용해야 한다.
        * */

        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4)); // 문자열! 확인은 equals 로 확인!!!!!!
    }
}
