package main.java.com.ohgiraffers.section06.time;

import java.time.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * time 패키지는 jdk 1.8 에서 추가된 기능이다.
        * Date, Calendar 가 가지고 있는 단점을 해소하기 위해 탄생했다.
        * time 패키지의 하위 패키지
        *
        * java.time
        *  .chorono : 국제표준에 정의된 달력 시스템을 위한 클래스 제공
        *  .format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
        *  .temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
        *  .zone : 시간대에 관련된 기능 제공
        *
        * 주고 잘 쓰는 클래스는
        * LocalTime, LocalDate, LocalDateTime, ZoneDateTime 들이 있다.
        * */

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow: " + timeNow);
        LocalTime timeOf = LocalTime.of(18,30,10);
        System.out.println("timeOf: " + timeOf);


        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow" + dateNow);
        LocalDate dateOf = LocalDate.of(2023,1,19);
        System.out.println("dateOf" + dateOf);
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow" + dateTimeNow);
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow,timeNow);
        System.out.println("dateTimeOf" + dateTimeOf);


        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("zonedDateTimeNow" +zonedDateTimeNow);
        ZonedDateTime ZonedDateTimeOf = ZonedDateTime.of(dateOf,timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("ZonedDateTimeOf" + ZonedDateTimeOf);

    }
}
