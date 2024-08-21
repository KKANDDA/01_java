package main.java.com.ohgiraffers.understand.chap02.chap022;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheater {
    static ArrayList<MovieDTO> movies = new ArrayList<MovieDTO>();
    static Scanner scr = new Scanner(System.in);

    public void movieAdd(){
        System.out.println("상영할 영화의 개수를 선택해라.");
        int num = scr.nextInt();
        scr.nextLine();

        for (int i = 0; i < num; i++)
        {
            System.out.println("제목: ");
            String title = scr.nextLine();
            System.out.println("상영시간: ");
            String runTime = scr.nextLine();
            System.out.println("배정할 좌석 수: ");
            int totalSeats = scr.nextInt();
            scr.nextLine();

            MovieDTO movieDTO = new MovieDTO(title, runTime, totalSeats, totalSeats);
            MovieTheater.movies.add(movieDTO);
        }

    }

    public void movieList(){
        for(MovieDTO movie: movies){

            System.out.println(movie);
        }
    }

    public void reservationService (String title){
        for(MovieDTO movie: movies)
        {
            if (movie.getTitle().equals(title))
            {
                System.out.println(title + " 의 예매 가능한 좌석 수: "
                        + movie.getAvailableSeats());
                System.out.println("몇 개의 좌석을 예매하겠는가?");
                int count = scr.nextInt();
                scr.nextLine();
                if (count <= 0)
                {
                    System.out.println("0보다 작은 수는 입력할 수 없다.");
                }
                else
                {
                    movie.setReservedSeats(movie.getReservedSeats() + count);
                    movie.setAvailableSeats((movie.getAvailableSeats() - count));
                    System.out.println("남은 좌석 수: "
                            + movie.getAvailableSeats());
                }

            }

        }

    }

}