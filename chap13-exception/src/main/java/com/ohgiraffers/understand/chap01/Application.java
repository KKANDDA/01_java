package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        AccountDTO[] accountMembers = new AccountDTO[10];
        /*
        accountMembers[0] = new AccountDTO(880414,"서현준",50000);
        */




        System.out.println("안녕하세요. 현준 은행입니다.");
        System.out.println("회원님의 계좌 등록을 도와드리겠습니다.");
        System.out.println("이름을 입력해 주세요.");
        String name = scr.nextLine();
        System.out.println("계좌번호를 정해 주세요.");
        int accountNumber = scr.nextInt();
        System.out.println("계좌에 맡기실 금액을 입력해 주세요.");
        int balance = scr.nextInt();

        accountMembers[0] = new AccountDTO(accountNumber, name, balance);
        AccountService accountService = new AccountService(accountMembers[0]);

        System.out.println("감사합니다. 원하시는 서비스를 선택해 주세요.");





        /*
        while(true){
        System.out.println("1. 로그인\n" +
                "2. 회원가입");
        int choice01 = scr.nextInt();

        try {
            if (choice01 == 1) {
                // 로그인 정보 확인 후, 정보가 맞으면(true) 입장 후, 계좌 서비스로 이동.
            } else if (choice01 == 2) {
                // 가입 정보를 입력 받은 후, 비밀번호까지 이중체크가 되면(true) 가입 완료 후, 로그인 서비스로 이동.
            } else {
                throw new Exception("정수 입력이 아닐 수도, 1과 2 중 입력이 아닐 수도 있습니다.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        break;
    }
    */







        int withdrawalAmount = 0;
        int depositAmount = 0;
        while (true) {
            System.out.println("1. 출금\n" +
                    "2. 입금\n" +
                    "3. 잔액 조회\n" +
                    "종료를 원하시면 \"9\"를 입력해 주세요.");
            int choice02 = scr.nextInt();
            scr.nextLine();
            switch (choice02) {
                case 1:
                    System.out.println("출금하시려는 금액을 입력해 주세요.");
                    withdrawalAmount = scr.nextInt();
                    if (accountService.withdrawalService(withdrawalAmount)) {
                        accountMembers[0].setAccountBalance
                                (accountMembers[0].getAccountBalance() - withdrawalAmount);
                        System.out.println(withdrawalAmount + " 원이 출금되었습니다. "
                                + accountMembers[0].getAccountBalance() + " 원 남았습니다.");
                        break;
                    }else{
                        System.out.println("잔액보다 출금하시려는 금액이 큽니다. 욕심이 과하네요.. 쯧쯧..");

                    }
                case 2:
                    System.out.println("입금하시려는 금액을 입력해 주세요.");
                    depositAmount = scr.nextInt();
                    accountMembers[0].setAccountBalance
                            (accountMembers[0].getAccountBalance() + depositAmount);
                    if (accountService.depositService(depositAmount)){
                        System.out.println(depositAmount+ "원 이 입금되었습니다. "
                                + accountMembers[0].getAccountBalance() + " 원 남았습니다.");
                        break;
                    }else{
                        System.out.println("확인되는 금액이 없습니다. 0보다 큰 액수를 넣어주세요.");

                    }
                case 3:
                    System.out.println("현재 잔액은 " + accountService.balanceCheck()); break;
                case 9:
                    System.out.println("다음 이용을 기다리겠습니다. 이용해 주셔서 감사합니다."); return;
            }
        }
    }
}
