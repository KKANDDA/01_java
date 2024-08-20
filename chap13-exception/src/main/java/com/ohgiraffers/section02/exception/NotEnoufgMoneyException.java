package main.java.com.ohgiraffers.section02.exception;

public class NotEnoufgMoneyException extends Exception {
    public NotEnoufgMoneyException() {
    }

    public NotEnoufgMoneyException(String message) {
        super(message);
    }
}
