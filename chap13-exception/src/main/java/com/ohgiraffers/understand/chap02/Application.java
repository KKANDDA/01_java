package main.java.com.ohgiraffers.understand.chap02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("현준 영화관 관리소입니다.");
        System.out.println("상영할 영화의 정보를 입력받겠습니다.");
        System.out.println("제목: ");
        String title = scr.nextLine();
        System.out.println("상영시간: ");
        String runTimeMinute = scr.nextLine();
        System.out.println("배정할 좌석 수: ");
        int allSeats = scr.nextInt();
        // 예약된 좌석은 나중에 set으로 입력한다.
        // int reservedSeats;





    }
}
