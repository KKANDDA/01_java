package main.java.com.ohgiraffers.section01.intEnum;

public class Application {
    public static void main(String[] args) {

        // 정수 열거 패턴의 단점을 이해할 수 있다.

        int subjects1 = Subjects.JAVA;
        int subjects2 = Subjects2.HTML;

        // 정수 값 만을 가지고 있는 필드일 뿐이다. // 의미있는 필드를 의미있게 보관하기에 어려움이 있다. int의 한계
        if (subjects1 == subjects2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        // 문자열로 출력하기 불편하다.
        int num =0;
        String subjectsName = "";

        switch (num) {
            case Subjects.JAVA: subjectsName = "Java"; break;
            case Subjects.MYSQL: subjectsName = "MySQL"; break;
            case Subjects.JDBC: subjectsName = "JDBC"; break;
        }
        System.out.println("subjectsName: " + subjectsName);

        // 타입 안전을 보장할 수 없다. (정수를 사용하기 때문에)
        printSubjects(Subjects.MYSQL);
        printSubjects(2);
    }
    public static void printSubjects(int subjectsNumber){
        String subjectsName = "";

        switch (subjectsNumber) {
            case Subjects.JAVA: subjectsName = "Java"; break;
            case Subjects.MYSQL: subjectsName = "MySQL"; break;
            case Subjects.JDBC: subjectsName = "JDBC"; break;
        }
        System.out.println("subjectsName: " + subjectsName);
    }



}
