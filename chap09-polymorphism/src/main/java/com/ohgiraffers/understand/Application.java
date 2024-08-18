package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        MemberService memberService;

        loop2: while(true){
            MemberDTO memberDTO =new MemberDTO();

            System.out.println("어서오세요. 통합 회원관리 서비스를 제공하는 HJ입니다. 원하시는 서비스를 선택해주세요.");
            System.out.println("1. 구글 로그인 \n" +
                    "11. 구글 회원가입 \n" +
                    "2. 네이버 로그인\n" +
                    "22. 네이버 회원가입\n" +
                    "3. 카카오 로그인\n" +
                    "33. 카카오 회원가입\n" +
                    "종료를 원하시면 \"9\"를 입력해주세요.");
            int choice = scr.nextInt();
            // switch 가 작동할 차례..

            if(choice == 1 || choice == 2 || choice == 3){
                scr.nextLine();
                System.out.println("아이디를 입력해주세요.");
                memberDTO.setId(scr.nextLine());
                System.out.println("비밀번호를 입력해주세요.");
                memberDTO.setPwd(scr.nextLine());
            }else if(choice == 11 || choice == 22 || choice == 33){
                scr.nextLine();
                System.out.println("아이디를 입력해주세요.");
                memberDTO.setId(scr.nextLine());
                System.out.println("이름을 입력해주세요.");
                memberDTO.setName(scr.nextLine());
                while (true){
                    System.out.println("비밀번호를 입력해주세요.");
                    String pwd1 = scr.nextLine();
                    System.out.println("확인을 위해 한 번 더 입력해주세요.");
                    String pwd2 = scr.nextLine();
                    if (pwd1.equals(pwd2)){
                        memberDTO.setPwd("pw1");
                        break;
                    }else{
                        System.out.println("일치하지 않습니다.");
                        continue;
                    }
                }
            }

            boolean result;
            loop:switch(choice){
                case 1:
                    memberService = new MemberService(new GoogleAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("google로그인에 성공하였습니다." + memberDTO.getName());
                        return;
                    }
                    break;
                case 2:
                    memberService = new MemberService(new NaverAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("naver로그인에 성공하였습니다." + memberDTO.getName());
                        return;
                    }
                    break;
                case 3:
                    memberService = new MemberService(new KakaoAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("kakao 로그인에 성공하였습니다." + memberDTO.getName());
                        return;
                    }
                    break;

                case 11:
                    memberService = new MemberService(new GoogleAuth());
                    result = memberService.addMember(memberDTO);
                    if (result) {
                        System.out.println("google 회원가입에 성공하였습니다." + memberDTO.getName());
                        return;
                    }
                    break;
                case 22:
                    memberService = new MemberService(new NaverAuth());
                    result = memberService.addMember(memberDTO);
                    if (result) {
                        System.out.println("google 회원가입에 성공하였습니다." + memberDTO.getName());
                        return;
                    }
                    break;
                case 33:
                    memberService = new MemberService(new KakaoAuth());
                    result = memberService.addMember(memberDTO);
                    if (result) {
                        System.out.println("google 회원가입에 성공하였습니다." + memberDTO.getName());
                        continue loop2;
                    }
                    break;

                case 9:
                    System.out.println("서비스를 종료합니다.");
                    break loop;

                default:
                    System.out.println("다시 입력해주세요.");
                    break ;

            }
        }
    }
}
