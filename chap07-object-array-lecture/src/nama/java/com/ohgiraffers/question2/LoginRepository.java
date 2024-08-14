package nama.java.com.ohgiraffers.question2;

public class LoginRepository {

    private final static UserDTO[] user = new UserDTO[10];

    private int count;


    public boolean join(UserDTO userDTO) {
        if (count < 10) {
            user[count++] = userDTO;
            return true;
        } else {
            System.out.println("유저가 꽉 찼습니다.");
            return false;
        }
    }

    public int login(UserDTO userDTO) {

        if (user[0] == null) {
            System.out.println("등록된 회원이 없습니다.");
            return 1;
        }

        for (int i = 0; i < user.length; i++) {
            if (user[i].getId().equals(userDTO.getId())) {
                if (user[i].getPwd().equals(userDTO.getPwd())) {
                    return 0;
                } else {
                    System.out.println("비밀번호가 다릅니다.");
                    return 1;
                }
            } else {
                System.out.println("아이디가 다릅니다.");
                return 1;
            }
        }
        System.out.println("일치하는 아이디가 없습니다.");
        return 1;
    }
}
