package main.java.com.ohigiraffers.section01.list.comparator;

import main.java.com.ohigiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) { // sort 는 어찌 작동하는지 몰라도 되나, 기준은 알려줘야 한다.

        int result = 0;

        if (o1.getPrice() > o2.getPrice()){
            result = 1; // 양수면 바꾸고
        }else if (o1.getPrice() < o2.getPrice()){
            result = -1; // 음수가 안 바꾸는 거
        }else {
            result = 0; // 같을 경우는 0을..
        }
        return result;

    }
}
