package main.java.com.ohgiraffers.understand;

public class Application02 {
    public static void main(String[] args) {
        switch (choice) {
            case 1:
                memberService = new MemberService(new GoogleAuth());
                result = memberService.findMember(memberDTO);
                if (result) {
                    System.out.println("goole로그인에 성공하였습니다. " + memberDTO.getId());
                    return;
                }
                break;
            case 2:
                memberService = new MemberService(new NaverAuth());
                result = memberService.findMember(memberDTO);
                if (result) {
                    System.out.println("naver로그인에 성공하였습니다. " + memberDTO.getId());
                    return;
                }
                break;
            case 3:
                memberService = new MemberService(new KakaoAuth());
                result = memberService.findMember(memberDTO);
                if (result) {
                    System.out.println("kakao 로그인에 성공하였습니다.. " + memberDTO.getId());
                    return;
                }
                break;
            case 9:
                System.out.println("로그인을 종료합니다.");
                return;
        }
    }
}
