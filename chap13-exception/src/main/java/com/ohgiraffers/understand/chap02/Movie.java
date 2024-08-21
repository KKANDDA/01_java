package main.java.com.ohgiraffers.understand.chap02;

public class Movie {

    private String title;
    private String runTimeMinute;
    private int availableSeats;
    private int reservedSeats;
    private int totalSeats;

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public Movie() {}

    public Movie(String title, String runTimeMinute, int availableSeats) {
        this.title = title;
        this.runTimeMinute = runTimeMinute;
        this.availableSeats = availableSeats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRunTimeMinute() {
        return runTimeMinute;
    }

    public void setRunTimeMinute(String runTimeMinute) {
        this.runTimeMinute = runTimeMinute;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    /*
        public boolean seatsReservation(){
            // 좌석을 예매하는 메소드, 예약 가능한 죄석이 없을 경우 예매 불가.
        }

        public boolean seatsCheck(){
            // 남은 좌석 확인 메소드
        }
    */

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", runTimeMinute='" + runTimeMinute + '\'' +
                ", availableSeats=" + availableSeats +
                ", reservedSeats=" + reservedSeats +
                ", totalSeats=" + totalSeats +
                '}';
    }
}
