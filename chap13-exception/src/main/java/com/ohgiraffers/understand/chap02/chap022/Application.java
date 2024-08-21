package main.java.com.ohgiraffers.understand.chap02.chap022;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        MovieTheater movieTheater = new MovieTheater();

        while (true)
        {
            System.out.println("현준 영화관이다.");

            System.out.println("원하는 서비스를 선택해라.");
            System.out.println("1. 영화 등록\n" +
                    "2. 영화 목록 확인\n" +
                    "3. 영화 예매\n" +
                    "9. 종료");
            int choice = scr.nextInt();
            scr.nextLine();
            switch(choice)
            {
                case 1: movieTheater.movieAdd(); break;
                case 2: movieTheater.movieList();break;
                case 3:
                    System.out.println("예매할 영화 제목 입력: ");
                    String title = scr.nextLine();
                    movieTheater.reservationService(title); break;
                default: System.out.println("똑바로 입력하라."); break;
            }

        }

    }

}
