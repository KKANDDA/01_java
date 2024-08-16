package nama.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        LoginService loginService =new LoginService();

        loop:while (true) {
            System.out.println("------------ 웰컴 투 현준 월드 --------------");
            System.out.println("로그인을 원하시면 1번");
            System.out.println("아직도 현준이의 친구가 아니십네까? \n 회원 가입을 원하시면 2번");
            System.out.println("종료를 원하시면 9번을 입력해 주세요.");

            String num = scr.nextLine();

            switch (num) {
                case "1": loginService.login();
                    break; /*Service 에게 내릴 1번 명령*/
                case "2": loginService.signUp();
                    break; /*Service 에게 내릴 2번 명령*/

                case "9": System.out.println("정말로 끄셔유..? 원하시면.. \"yes\"");
                if (scr.nextLine().equals("yes")) {
                    System.out.println("네 종료합니다.");
                    break loop;
                } else {
                    continue;
                }
                default:
                    System.out.println("다시 입력해 주세요.");
                    break ;
            }
        }

    }
}
