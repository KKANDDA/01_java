package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class MemberService {
    // 전역변수
    private SnsAuth snsAuth;
    // 생성자
    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }
    public boolean findMember(MemberDTO memberDTO){
        boolean result = snsAuth.login(memberDTO);
        return result;
    }
    public boolean addMember(MemberDTO memberDTO){
        boolean result = snsAuth.signUp(memberDTO);
        return result;

    }
}
