package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    MemberDTO[] naverMembers = new MemberDTO[888888888];
    MemberDTO naverMember = new MemberDTO("naver", "naver");

    @Override
    public boolean login(MemberDTO userIfo) {
        for (int i = 0; i < naverMembers.length; i++) {
            if(naverMembers == null){
                System.out.println("지금 당신이 오신다면 \"Naver\"의 첫 번째 회원님이 되시겠습니다!");
                return false;
            }
            naverMembers[0] = naverMember;
            if (naverMembers[i].getId().equals(userIfo.getId())&&
                    naverMembers[i].getPwd().equals(userIfo.getPwd())) {
                System.out.println(" 님, 정상적으로 \"Naver\"에 로그인되셨습니다.");
                return true;
            }
            System.out.println("아이디나 비밀번호가 확인되지 않습니다.");
            return false;
        }
        return false;
    }
}
