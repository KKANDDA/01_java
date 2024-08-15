package nama.java.com.ohgiraffers.question;

public class LoginRepository {

    private final static UserDTO[] members = new UserDTO[10];
    private static int count;

    public boolean/*리턴으로 뱉을 자료형, 매개변수와 상관이 전혀없다.*/
    signup(UserDTO/*클래스형 타입의 자료형*/ userIformation/*전달받은 매개변수는 리턴으로 뱉을 자료형과 상관이 전혀 없다.*/) {
        // 사용자가 입력한 아이디 비밀번호 저장하는 곳

        if (count != 10) {
            members[count++] = userIformation;
            return true/*불린이니까 트루 펄스로 뱉는 거다.*/;
        } else {
            System.out.println();
            return false;
        }
    }

    public boolean login(UserDTO user) {
        for (int i = 0; i < members.length; i++) {
            if(members[i].getId().equals.(user.getId())) && (members[i].getPwd().equals.(user.getPwd()))
            return true;
        }else{
            return false;
        }

    }

}
