package main.java.com.ohgiraffers.section01.array.exercise;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);

        System.out.println("배열의 크기 정하기");
        int length = scr.nextInt();

        if(length <= 1){
            System.out.println("배열의 크기를 1보다 크게 입력해주세요.");
            return;
        }
        System.out.println("배열의 요소를 입력해주세요.");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scr.nextInt();
        }
        int biggst = arr[0];


        // 반복문을 이용해 값 찾기

        for (int i = 0; i < length; i++) {
            if(arr[i] > biggst){
                biggst = arr[i];
            }
        }
        System.out.println(biggst);
    }
}
