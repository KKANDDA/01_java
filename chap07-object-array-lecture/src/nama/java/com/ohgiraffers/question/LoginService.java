package nama.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {

    Scanner scr = new Scanner(System.in);

    public void signUp(){
        LoginRepository loginRepository = new LoginRepository();
        System.out.println("--------- 회원 가입창 -----------");
        System.out.println("아이디를 입력해 주세요. 이름, 비밀번호");
        String id = scr.nextLine();
        String name = scr.nextLine();
        String pwd;
        String pwd2;

        while(true) {
            System.out.println("비밀번호");
        pwd = scr.nextLine();
            System.out.println("비밀번호 확인");
        pwd2 = scr.nextLine();

            if (!pwd.equals(pwd2)) {
                // 가입을 진행한다.
                System.out.println("비밀번호가 일치하지 않습니다. \n" +
                        "다시 입력해 주세요.");
                continue;
            }
            break;
        }
        UserDTO user = new UserDTO(id, name, pwd);
        if(loginRepository.signup(user))/*true, false 값을 받는다.*/{
            System.out.println("회원가입이 완료됐습니다.");
        }else{
            System.out.println("회원가입이 불가합니다. 정원이 넘었습니다.");
        }

    }
    public void login(){
        System.out.println("ID 를 입력해주세요.");
        String id = scr.nextLine();
        System.out.println("PASSWORD 를 입력해주세요.");
        String pwd = scr.nextLine();

        UserDTO userDTO = new UserDTO(id, pwd);
        boolean isTrue =LoginRepository.



    }
}
