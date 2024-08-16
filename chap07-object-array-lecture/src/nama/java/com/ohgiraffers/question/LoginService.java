package nama.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {
    LoginRepository loginRepository = new LoginRepository();

    Scanner scr = new Scanner(System.in);

    public void signUp(){

        System.out.println("--------- 회원 가입창 -----------");
        System.out.println("아이디를 입력해 주세요.");
        String id = scr.nextLine();
        System.out.println("이름을 입력해주세요.");
        String name = scr.nextLine();
        String pwd;
        String pwd2;

        while(true) {
            System.out.println("사용할 비밀번호를 입력해주세요. \n ... 보안이 유지되지 않으니 신중하게 입력하지 마세요 ...");
        pwd = scr.nextLine();
            System.out.println("확인을 위해 비밀번호를 다시 입력해주세요.");
        pwd2 = scr.nextLine();

            if (!pwd.equals(pwd2)) {
                System.out.println("비밀번호가 일치하지 않습니다. \n" +
                        "다시 입력해 주세요.");
                continue;
            }
            break;
        }
        UserDTO newUser = new UserDTO(id, name, pwd);
        if(loginRepository.signup(newUser)){
            System.out.println(newUser.getName() + "님, 현준 월드에 오신 것을 환영합니다.");
        }else{
            System.out.println("죄송합니다. 회원가입이 불가합니다. 제가 감당할 수 있는 정원을 초과하였습니다.");
        }

    }
    public void login(){
        System.out.println("ID : ");
        String id = scr.nextLine();
        System.out.println("PASSWORD : ");
        String pwd = scr.nextLine();

        UserDTO user = new UserDTO(id, pwd);
        boolean isTrue =loginRepository.login(user);
        if(isTrue == true){
        }else{
            System.out.println("정보가 없습니다. 아직 회원이 아니시면 회원 가입을 진행해주세요.");

        }



    }
}
