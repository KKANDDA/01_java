package nama.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application { // 프로그램 실행부
    public static void main(String[] args) {

        /*
        * 여러 명의 회원 정보를 한 번에 등록
        * 전체 회원 조회 시 여러 명의 회원 정보를 한 번에 반환
        *
        * MemberReposittory - static 필드로 회원 정보들을 저장 (최대 10명까지)
        *
        * */

        /*
        작동 순서

        * 1번 어플리케이션에서 서비스로 값 전달. 1
        * 2번 서비스는 레지스터로 배열 정리된 맴버 정보와 리포지토리에서 정한 배열의 길이(회원 수의 정원)를 전달.
        * 3번 레지스터는 최종적으로 어플리케이션에 값을 전달.
        * */

        /*
        * 1을 입력했을 때 흐름...
        * 케이스 1을 선택하게 된다.
        * 케이스 1은 서비스 클래스의 사인업맴버스의 메소드를 호출한다.
        * 그리고 서비스 클래스의 사인업맴버스 메소드는 회원의 정보들을 통으로 배열에 담고 있다.
        * 이후 서비스 클래스에서 레지스터 클래스의 레지스트 매소드로 값(회원 정보)을 전달해 해당하는 값을 받는다.
        * (이때 레지스터는 각각의 회원 정보를 담은 members 배열을 member 라는 변수로 바꾼다.)
        * 그리고 리파지토리의 store 라는 메소드에서 리턴값(여기선 true, false)을 받아 정원 초과 여부를 출력한다.
        * (이때 리파지토리는 실제 계산식이 들어가는 클래스이다.)
        * */

        /*
        * 2를 입력했을 때 흐름...
        *
        * case 2번을 호출한다.
        *
        * case 2번의 내용은 서비스 클래스에서 받는다.
        *
        * Service 클래스의 내용은 Member[] members 로 배열화된 회원 정보들과
        * Repository.resist(members)로 값을 전해 해당하는 리턴값을 받는 것이다.
        *
        * Repository 클래스의 내용은 전역 변수 회원의 정원,
        *
        * */


        Scanner scr = new Scanner(System.in); // 사용자의 입력을 받기 위함

        MemberService memberService = new MemberService(); // 객체를 heap 에 생성하여 메소드를 실행할 준비.

        loop :while (true) {
            System.out.println("--------- 회원관리 프로그램 ----------------");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scr.nextInt();

            switch (no) {
                case 1: memberService.signUpMembers(); break; /*서비스에게 내릴 1번 명령*/
                case 2: memberService.showAllMembers(); break; /*service 에게 내릴 2번 명령*/
                case 9:
                    System.out.println("프로그램을 종료합니다."); break loop;
                default:
                    System.out.println("잘못된 번호입니다."); break;

            }
        }


    }


}
