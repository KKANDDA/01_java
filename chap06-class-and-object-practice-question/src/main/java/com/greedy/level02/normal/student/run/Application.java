package main.java.com.greedy.level02.normal.student.run;

import main.java.com.greedy.level02.normal.book.model.dto.BookDTO;
import main.java.com.greedy.level02.normal.student.model.vo.StudentVo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력

        // 변수 선언을 해서 변수를 전달인자로 보낸다.
        int grade;
        int classroom;
        String name;
        Double hight;
        char gender;

        Scanner scr = new Scanner(System.in);

        System.out.println("학생의 정보를 입력해 주세요.");
        System.out.println("학년 , 반, 이름, 키,  성별순으로 차례대로 입력해 주세요.");

        StudentVo seoHyeonJun = new StudentVo();
            grade = scr.nextInt();
            classroom = scr.nextInt();
            name = scr.nextLine();
            hight = scr.nextDouble();
            gender = scr.nextLine().charAt(0);
        seoHyeonJun.printInformation();



        /*학년 : 1
    반 :　２
    이름 : 홍길동
    키 : 175.5
    성별 : 남*/

        // 인스턴스는 클래스를 통해서 만들어진다. java는 그것 밖에 객체를 만들 길이 없다.

    }
}
