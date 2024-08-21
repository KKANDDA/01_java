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
        scr.nextLine(); // int 의 개행을 받는 용도


        for (int i = 0; i < n; i++) {

            System.out.println("상영할 영화의 정보를 입력 받겠습니다.");
            // 갯수에 맞게 정보를 받을 수 있도록 만든다.

            System.out.println("제목: ");
            String title = scr.nextLine();

            System.out.println("상영시간: ");
            String runTimeMinute = scr.nextLine();

            System.out.println("배정할 좌석 수: ");
            int allSeats = scr.nextInt();
            scr.nextLine();

            Movie movie = new Movie(title,runTimeMinute,allSeats);
            movieTheater.addMovies(movie);

        }




        /*
        예약된 좌석은 나중에 set으로 입력한다.
        int reservedSeats;
        */
        loop: while (true) {
            System.out.println("----- 소비자 모드 -----\n현재 상영 중인 영화들입니다.");
            // 입력 받은 영화들의 정보를 각각 띄워준다.
            movieTheater.movieList();

            System.out.println("어떤 영화를 예매하시겠습니까?");
            // 사용할 값은 좌석으로, 예매가 가능하도록 만들고,
            // 좌석 수가 실시간으로 방영 될 수 있도록 만든다.
            String movieName = scr.nextLine();

            if (movieTheater.selectMovie(movieName)) {
                System.out.println("선택하신 영화는 " + "\"" + movieName + "\"" + " 입니다.");
            }else {
                System.out.println("목록에 없는 영화입니다. 다시 선택해 주세요.");
                continue;
            }

            if (movieTheater.availableSeat(movieName)){
                System.out.println("해당 영화의 남은 좌석은 "
                    + movieTheater.availableSeatsCounts(movieName) + " 개 입니다.");
            }else {
                System.out.println("해당 영화는 남은 좌석이 없습니다. 다른 영화를 선택해 주세요.");
            }

            System.out.println("몇 개의 좌석을 예매하시겠습니까?");
            int counts = scr.nextInt();
            if(counts >0){
                System.out.println(movieTheater.reservationService(counts,movieName) +
                        " 개의 좌석이 예약되셨습니다.");
                System.out.println("예약 가능한 남은 좌석은 " +
                                movieTheater.reservatedSeats(counts,movieName) + " 개 입니다.");
                System.out.println("계속해서 예약하시려면 1.\n" +
                        "서비스 종료를 원하시면 2. 를 입력해 주세요.");

                while (true) {
                    int choice = scr.nextInt();
                    scr.nextLine();
                    switch (choice) {
                        case 1: continue loop;
                        case 2: return;
                        default: break;
                    }
                }

            }else {
                System.out.println("원하시는 좌석의 갯수를 다시 입력해 주세요. (한 좌석 이상)");
                continue;
            }
        }
    }
}
