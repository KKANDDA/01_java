package nama.java.com.ohgiraffers.section02.uses;

public class MemberRegister { // 회원 등록을 레퍼지토리에 명령하는 클래스

    public void regist(Member[] members){
        System.out.println("회원을 등록합니다.");

        for(Member member : members){ // members 배열을 member 변수로 각각대입함.
            System.out.println(member + "님 회원 등록 시도합니다.");
        }
        if(MemberRepository.store(members)/*불린이라 이프안에 쓸수 있다. 리터지토리에서 값을 받았다. */){
            System.out.println("총 " + members.length + "명의 회원이 등록 성공했습니다.");
        }else{ // 리파지토리에서 프린트된 정원초과도 프린트되고 밑에도..
            System.out.println("인원이 마감되어 등록에 실패했습니다.");
        }
    }

}
