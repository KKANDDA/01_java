package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

import java.util.Scanner;

public class MemberService {

    MemberDTO[] members ;

    public boolean findMember(MemberDTO memberDTO){
        if(members == null){
            return false;
        }
        for (int i = 0; i < members.length; i++) {
            if(members[i].getId().equals(memberDTO.getId()) &&
            (members[i].getPwd().equals(memberDTO.getPwd()))){
                return true;
            }else{
                System.out.println("아이디, 비밀번호가 다릅니다.");
                return false;
            }

        }
        return false;

    }
}
