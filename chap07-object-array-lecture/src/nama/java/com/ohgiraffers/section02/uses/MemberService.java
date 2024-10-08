package nama.java.com.ohgiraffers.section02.uses;

public class MemberService { // application 의 명령을 실행할 곳

    public void signUpMembers(){

        Member/*클래스*/[]/*클래스 안의 필드를 배열로 받는다는 뜻*/ members/*클래스 필드를 묶은 배열의 변수명, 객체명, 인스턴스명*/ = new Member[5];

        members[0] = new Member/*전체 필드 초기화 생성자*/(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 40, '남');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 36, '여');
        members[4] = new Member(5, "user05", "pass05", "윤봉길", 22, '남');

        /* register 에 명령 */
        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members); // 서비스에서 레지스터에 맴버 정보를 명령하고
    }
    public void showAllMembers(){
        MemberFinder memberFinder = new MemberFinder();
        System.out.println("------ 가입된 회원 목록 ------------");
        for(Member member:memberFinder.findAllMembers()){
            if(member != null){
                System.out.println(member);
            }
        }
        System.out.println("회원 조회 완료 ------------------");


    }
}
