package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {
    private final static MemberDTO[] googleMembers = new MemberDTO[999999999]; ;
    private static int count;
    MemberDTO googleMember = new MemberDTO("google", "구그루","google");

    @Override
    public boolean login(MemberDTO userIfo) {
        if (googleMembers == null) {
            System.out.println("당신이 오신다면 \"google\"의 첫 번째 회원이 되시겠습니다!");
            return false; // signUp 메소드를 맹글어야 써먹을 수 있을 것 같은데.. 아유.. 으렵당..
        }
        for (int i = 0; i < googleMembers.length; i++) {
            googleMembers[0] = googleMember;
            if (googleMembers[i].getId().equals(userIfo.getId()) &&
                    googleMembers[i].getPwd().equals(userIfo.getPwd())) {
                System.out.println(googleMembers[i].getId() +
                        " 님, 정상적으로 \"google\"에 로그인되셨습니다.");
                return true;
            } else {
                System.out.println("아이디나 비밀번호가 확인되지 않습니다.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean signUp(MemberDTO useIfo) {
        if (count != googleMembers.length){
            googleMembers[count++] = useIfo;
            return true;
        }
        return false;
    }
}
