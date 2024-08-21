package main.java.com.ohgiraffers.understand.chap02.chap022;

public class MovieDTO {

    private String title;
    private String runTimeMinute;
    private int totalSeats ;
    private int reservedSeats;
    // 여기까지가 과제 조건
    private int availableSeats;

    public MovieDTO() {
    }

    public MovieDTO(String title, String runTimeMinute, int availableSeats, int totalSeats) {
        this.title = title;
        this.runTimeMinute = runTimeMinute;
        this.totalSeats = totalSeats;
        this.reservedSeats = reservedSeats;
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

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {

        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", runTimeMinute='" + runTimeMinute + '\'' +
                ", totalSeats=" + totalSeats +
                ", reservedSeats=" + reservedSeats +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
