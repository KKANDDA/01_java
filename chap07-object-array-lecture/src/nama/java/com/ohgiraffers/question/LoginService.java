package nama.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {
    public void signUp(){
        LoginRepository loginRepository = new LoginRepository();
        Scanner scr = new Scanner(System.in);
        System.out.println("아이디를 입력해 주세요.");
        String id = scr.nextLine();
        String name = scr.nextLine();
        int pwd;
        int pwd2;
        while(true) {
        pwd = scr.nextInt();
        pwd2 = scr.nextInt();

            if (pwd == pwd2) {
                // 가입을 진행한다.
                User user = new User(id, name, pwd);
                loginRepository.signup(user);
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. \n" +
                        "다시 입력해 주세요.");
                continue;
            }
        }


    }
    public void login(){
        Scanner scr = new Scanner(System.in);
        String id = scr.nextLine();
        int pwd = scr.nextInt();


    }
}
