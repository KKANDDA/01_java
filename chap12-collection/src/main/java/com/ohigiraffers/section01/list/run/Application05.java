package main.java.com.ohigiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {
    public static void main(String[] args) {
        /*
         * Queue
         * Queue 는 선형 메모리 공간에 데이터를 저장하는 선입선출(FIFO) 방식의 자료구조이다. // 큐는 단방향.. 흘러가는 느낌 // 스택은 바구니 느낌
         * Queue 인터페이스를 상속 받은 하위 인터페이스 들은
         * Deque, BlockingQueue, TransferQueue 등 다양하지만
         * 대부분 큐는 LinkedList 를 이용한다.
         * */


        // Queue 자체는 인터페이스
        // Queue<String> que = new Queue();

        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        /*
        * peek() : 해당 큐의 가장 앞에 있는 요소 반환
        * poll() : 해당 큐의 가장 앞에 있는 요소 반환 후 제거
        * */
        System.out.println("peek() : " + que.peek());
        System.out.println("peek() : " + que.peek());
        System.out.println(que); // 가장 먼저 들어온 값


        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll()); // poll() 은 반환할 값이 없으면 디폴트 값(null)이 나온다.

        System.out.println(que);
    }
}
