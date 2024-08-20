package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        MovieTheater movieTheater = new MovieTheater();
        System.out.println("----- 관리자 모드 ----- 현준 영화관 관리소입니다.");

        System.out.println("상영관에 올릴 영화는 몇 편입니까?");
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("상영할 영화의 정보를 입력 받겠습니다.");
            // 갯수에 맞게 정보를 받을 수 있도록 만든다.

            System.out.println("제목: ");
            System.out.println();
            String title = scr.nextLine();

            System.out.println("상영시간: ");
            String runTimeMinute = scr.nextLine();

            System.out.println("배정할 좌석 수: ");
            int allSeats = scr.nextInt();

            Movie movie = new Movie(title,runTimeMinute,allSeats);
            movieTheater.addMovie(movie);

        }




        /*
        예약된 좌석은 나중에 set으로 입력한다.
        int reservedSeats;
        */

        System.out.println("----- 소비자 모드 ----- 현재 상영 중인 영화들입니다.");
        // 입력 받은 영화들의 정보를 각각 띄워준다.

        System.out.println("어떤 영화을 예매하시겠습니까?");
        // 사용할 값은 좌석으로, 예매가 가능하도록 만들고,
        // 좌석 수가 실시간으로 방영 될 수 있도록 만든다.




        List<Movie> movies = new ArrayList<>();






    }
}
