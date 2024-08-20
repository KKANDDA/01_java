package main.java.com.ohgiraffers.understand.chap02;

public class Movie {

    private String title;
    private String runTimeMinute;
    private int allSeats;

    public Movie(String title, String runTimeMinute, int allSeats) {
        this.title = title;
        this.runTimeMinute = runTimeMinute;
        this.allSeats = allSeats;
    }

    public boolean seatsReservation(){
        // 좌석을 예매하는 메소드, 예약 가능한 죄석이 없을 경우 예매 불가.
    }

    public boolean seatsCheck(){
        // 남은 좌석 확인 메소드
    }
}
