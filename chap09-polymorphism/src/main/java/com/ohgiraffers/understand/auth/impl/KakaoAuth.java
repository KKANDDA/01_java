package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

import java.util.Arrays;

public class KakaoAuth implements SnsAuth {
    private final static MemberDTO[] kakaoMembers = new MemberDTO[10];
    private static int count;
    MemberDTO kakaoMember = new MemberDTO("kakao", "가가오", "kakao");

    @Override
    public boolean login(MemberDTO userIfo) {
        if (kakaoMembers == null) {
            System.out.println("당신이 오신다면 \"kakao\"의 첫 번째 회원이 되시겠습니다.");
            return false;
        }
        for (int i = 1; i < kakaoMembers.length; i++) {
            kakaoMembers[0] = kakaoMember;

            System.out.println(kakaoMembers[1].getId() + kakaoMembers[1].getPwd());
            System.out.println(userIfo.getId() + userIfo.getPwd());

            if (kakaoMembers[i].getId().equals(userIfo.getId()) &&
                    kakaoMembers[i].getPwd().equals(userIfo.getPwd())) {
                System.out.println(kakaoMembers[i].getId() +
                        " 님, 정상적으로 \"kakao\"에 로그인되셨습니다.");
                return true;
            } else {
                System.out.println("아이디나 비밀번호를 확인해주세요.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean signUp(MemberDTO useIfo) {
        if (count != kakaoMembers.length){

            kakaoMembers[++count] = useIfo;

            return true;
        }
        return false;
    }
}
