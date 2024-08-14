package nama.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class LoginService {

    Scanner scr = new Scanner(System.in);

    LoginRepository loginRepository = new LoginRepository();

    public void signUp(){
        System.out.println("==== 회원 가입 창 ====");
        System.out.println("아이디를 입력 해주세요 ");
        String a = scr.nextLine();
        System.out.println("이름을 입력 해주세요 ");
        String b = scr.nextLine();

        while(true){
            System.out.println("비밀번호를 입력 해주세요 ");
            String c = scr.nextLine();
            System.out.println("비밀번호를 확인 해주세요 ");
            String d = scr.nextLine();
            if(c.equals(d)){
                UserDTO user = new UserDTO(a,c,b);
                boolean isTrue = loginRepository.join(user);
                if (isTrue){
                    System.out.println("등록 완료 되었습니다.");
                    return;
                }
                System.out.println();
                return;
            }else {
                System.out.println("비밀번호 확인이 실패했습니다.");
            }
        }




    }
    public int login(){
        while(true){
            System.out.println("==== 아이디를 입력 해주세요 ====");
            String a = scr.nextLine();
            System.out.println("비밀번호를 입력 해주세요 ");
            String b = scr.nextLine();

            UserDTO userDTO = new UserDTO(a,b);
            int isTrue = loginRepository.login(userDTO);

            if(isTrue==0){
                System.out.println("로그인 완료 되었습니다 축하드립니다.");
                return 0;
            }else {
                return 1;
            }
        }
    }
}
