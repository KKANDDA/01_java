package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;
import java.util.List;

public class MovieTheater {

    private List<Movie> movies = new ArrayList<>();

    public MovieTheater() {
    }

    public MovieTheater(List<Movie> movies) {
        this.movies = movies;
    }

    public void addMovies(Movie movie){
        movies.add(movie);
    }

    public void movieList(){
        for(Movie movieList : movies){
            System.out.println(movieList);
        }
    }

    public boolean selectMovie(String movieName){
        for(Movie movieList : movies){
            if (movieList.getTitle().equals(movieName)){
                return true;
            }
        }
        return false;
    }

    public boolean availableSeat(String movieName){
        for(Movie movieList : movies){
            if ((movieList.getTitle().equals(movieName)) &&
            movieList.getAvailableSeats()>0){
                return true;
            }
        }
        return false;
    }
    public int availableSeatsCounts(String movieName){
        for(Movie movieList : movies){
            if ((movieList.getTitle().equals(movieName)) &&
            movieList.getAvailableSeats()>0){
                movieList.setTotalSeats(movieList.getAvailableSeats());
                return movieList.getAvailableSeats();
            }
        }
        return 0;
    }

    public int reservationService(int countSeats, String movieName){
        for(Movie movieList : movies){
            if ((movieList.getTitle().equals(movieName)) &&
            countSeats > 0){
                movieList.setReservedSeats(+countSeats);

                movieList.setReservedSeats(movieList.getTotalSeats()-
                        movieList.getReservedSeats());
                return movieList.getReservedSeats();

            }
        }
        return 0;
    }

    public int reservatedSeats (int countSeats, String movieName){
        for(Movie movieList : movies){
            if ((movieList.getTitle().equals(movieName)) &&
            countSeats > 0){
                movieList.setAvailableSeats(movieList.getAvailableSeats()-movieList.getReservedSeats());

                return movieList.getAvailableSeats();
            }
        }
        return 0;
    }


}
