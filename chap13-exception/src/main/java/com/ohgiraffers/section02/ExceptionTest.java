package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoufgMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNagativeException;

import java.text.ParseException;

public class ExceptionTest {

    public void checkEnoughMoney(int price ,int money) throws
            PriceNagativeException, MoneyNegativeException, NotEnoufgMoneyException {

        System.out.println("가지고 있는 돈은 " + money + " 원입니다.");

        if (price < 0) {
            throw new PriceNagativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeException("가진 돈은 음수 일 수 없습니다.");
        }
        if(money<price){
            throw new NotEnoufgMoneyException("가진 돈 보다 상품 가격이 비쌉니다.");
        }
        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑하세요~");
    }
}
