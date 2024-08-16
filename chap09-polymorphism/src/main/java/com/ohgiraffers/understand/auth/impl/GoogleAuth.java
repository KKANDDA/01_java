package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {
    MemberDTO[] googleMembers ;
    MemberDTO googleMember = new MemberDTO("google", "google");

    @Override
    public boolean login(MemberDTO userIfo) {
        for (int i = 0; i < googleMembers.length; i++) {
            googleMembers[0] = googleMember;

        }

        if(googleMembers[0].getId().equals(userIfo.getId()) &&
                (googleMembers[0]).getPwd().equals(userIfo.getPwd())){
            System.out.println("구글에 정상적으로 로그인되었습니다.");
            return true;
        }
        System.out.println("아이디나 비밀번호가 확인되지 않습니다.");
        return false;
    }
}
