package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);

        System.out.println("어서오세요. 통합 로그인 서비스입니다.");
        System.out.println("1. 구글 \n" +
                "2.카카오\n" +
                "3. 네이버\n" +
                "이 셋 중 하나를 선택해주세요." +
                "종료를 원하시면 \"9\"를 입력해주세요.");

        int choice = scr.nextInt();

        while(true){
            switch(choice){
                case 1: break;
                case 2: break;
                case 3: break;

                case 9: break;

                default:
                    System.out.println("잘 못 된 입력입니다. 다시 입력해주세요.");
                    continue;
            }
            System.out.println("ID 를 입력해주세요.");
            String id = scr.nextLine();
            System.out.println("PASSWORD 를 입력해주세요.");
            String pwd = scr.nextLine();
        }




    }
}
