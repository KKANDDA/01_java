package nama.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        LoginService loginService = new LoginService();

        loop :while(true){
            System.out.println("---- 로그인 및 회원가입 프로그램 ----");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("9. 프로그램 종료");
            int no = scr.nextInt();

            switch (no){
                case 1:
                    int isOn = loginService.login();
                    if(isOn ==0){
                        return;
                    }else {
                        break;
                    }
                case 2 : loginService.signUp();break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    break loop;
                default:
                    System.out.println("잘못된 번호를 입력 하셨습니다.");
                    break;
            }


        }


    }
}
