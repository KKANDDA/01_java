package nama.java.com.ohgiraffers.question;

public class UserDTO {

    // 전역변수
    private String id;
    private String name;
    private String pwd;

    // 로그인용 전역변수 생성자 // 아이디, 패스워드
    public UserDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // 전연 변수 초기화 생성자
    public UserDTO(String id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    // 게터 세터 // 겟으로 받아서 셋으로 뱉어!!!
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
