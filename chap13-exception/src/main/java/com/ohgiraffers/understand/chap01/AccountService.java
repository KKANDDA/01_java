package main.java.com.ohgiraffers.understand.chap01;

public class AccountService {

    AccountDTO accountDTO;

    public AccountService(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    int balance;

    public AccountService() {

    }

    public boolean withdrawalService (int withdrawal){
        if(accountDTO.getAccountBalance() >= withdrawal){
            return true;
        }
        return false;
    }

    public boolean depositService (int deposit){
        if(deposit > 0){
            return true;
        }
        return false;
    }

    public int balanceCheck(){
       return accountDTO.getAccountBalance();
    }
}
