package main.java.com.ohgiraffers.understand.chap01;

public class AccountDTO {

    private int accountNumber;
    private String accountOwnerName;
    private int accountBalance;

    public AccountDTO() {
    }

    public AccountDTO(int accountNumber, String accountOwnerName, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "accountNumber=" + accountNumber +
                ", accountOwnerName='" + accountOwnerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
