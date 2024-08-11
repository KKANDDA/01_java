package main.java.com.ohgiraffers.section04.sort.exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        // 베열의 크기와 요소를 입력 받아 선택 정열로 큰 수와 두 번째 큰수를 출력해 보자. (실수로도 가능하도록..)

        Scanner scr =new Scanner(System.in);

        System.out.println("큰 수, 두 번째 큰 수 찾아내기!");

        while(true){
            System.out.println("배열의 크기를 정해 주세요.");
            int length = scr.nextInt();
            double[] arr = new double[length];
            if(length > 1){
                System.out.println("배열의 요소를 입력해 주세요.");
            }else{
                System.out.println("2이상으로 크기를 정해 주세요.");
                continue;
            }
            for (int i = 0; i < length; i++) {
                arr[i] = scr.nextDouble();
            }
            System.out.println("큰 수와 두 번째 큰 수를 찾고 있습니다. 조금만 기다려 주세요. \n" +
                    "... ... .");

            int min;
            Double temp;
            for (int i = 0; i < length; i++) {
                min = i;
                for (int j = i+1; j < length; j++) {
                    if(arr[min] > arr[j]){
                        min = j;
                    }
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            System.out.println("가장 큰 수는 " + arr[length-1] + "두 번째 큰 수는 " + arr[length-2] + "입니다.");
            System.out.println("종료를 원하시면 \"끝\"이라고 입력해 주세요. - 계속하길 원하시면 아무 문자나 입력해 주세요.");
            scr.nextLine();
            if(scr.nextLine().equals("끝")){
                break;
            }
        }
    }
}
