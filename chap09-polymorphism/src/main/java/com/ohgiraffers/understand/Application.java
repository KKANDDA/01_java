package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        while(true){
            Scanner scr =new Scanner(System.in);
            MemberService memberService = new MemberService();
            MemberDTO memberDTO =new MemberDTO();


            System.out.println("어서오세요. 통합 로그인 서비스입니다. 찾으시는 곳을 선택해주세요.");
            System.out.println("1. 구글 \n" +
                "2.네이버\n" +
                "3. 카카오\n" +
                "종료를 원하시면 \"9\"를 입력해주세요.");
            String choice = scr.nextLine();

            // switch 가 작동할 차례..

            System.out.println("아이디를 입력해주세요.");
            memberDTO.setId(scr.nextLine());
            System.out.println("비밀번호를 입력해주세요.");
            memberDTO.setPwd(scr.nextLine());
            boolean result;


            switch(choice){
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
}
