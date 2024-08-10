package main.java.com.ohgiraffers.section01.array.exercise;

import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner scr =new Scanner(System.in);

        System.out.println("배열의 크기를 정하시오.");
        int length =scr.nextInt();
        int[] arr = new int[length];

        System.out.println("값을 부여하시오.");
        for (int i = 0; i < length; i++) {
            arr[i] =scr.nextInt();
        }
        System.out.println("가장 큰 수를 찾는 중입니다.");
        int biggst = arr[0];
        int secondBiggst = arr[0];
        for (int i = 0; i < length; i++) {
            if(arr[i] > biggst){
                secondBiggst = biggst;
                biggst = arr[i];
            }else if(arr[i] > secondBiggst || secondBiggst == biggst ){
                secondBiggst = arr[i];
            }System.out.println(biggst +" "+ secondBiggst);
        }


        System.out.println("가장 큰 수는 " + biggst);
        System.out.println("두 번째로 큰 수는 " + secondBiggst);


    }
}
