package nama.java.com.ohgiraffers.question;

public class LoginRepository {

    private final static UserDTO[] member = new UserDTO[10];
    private static int count;

    public boolean signup(UserDTO user/*받은 정보*/) {
        // 사용자가 입력한 아이디 비밀번호 저장하는 곳

        if (count != 10) {
            member[count++] = user;
            return true;
        } else {
            System.out.println("정원 초과입니다.");
            return false;
        }
    }

    public boolean login(UserDTO userDTO) {

    }

}
