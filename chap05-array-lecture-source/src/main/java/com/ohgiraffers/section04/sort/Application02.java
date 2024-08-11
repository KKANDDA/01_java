package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        // 순차정렬

        int[] iarr = {2, 5, 4, 6, 1, 3};

        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp; //
                }
            }

        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");


        }
        System.out.println("------------------- exercise ------------------------");
        Scanner scr = new Scanner(System.in);

        // 배열의 크기와 요소를 정하고, 둘의 크기를 비교해 큰 값과 그 다음 값을 알려주는 코드를 작성해보자!

            while(true){
                System.out.println("배열의 크기를 정해주세요.");
                int length = scr.nextInt();
                if(length > 1){
                    System.out.println("배열의 요소를 정해주세요.");
                }else{
                    System.out.println("요소들의 크기를 비교하기 위해 2 이상의 수를 넣어주세요.");
                    continue;
                }
                // 배열의 요소입력
                int[] arry = new int[length];
                for(int i = 0; i < length; i++){
                    arry[i] = scr.nextInt();
                }
                System.out.println("가장 큰 값과 두 번째 큰 값을 찾고 있습니다.\n" +
                        "... ... .");
                for(int i = 0; i < length; i++) {
                    for(int j = i+1; j < length; j++){
                        if(arry[i] > arry[j]){ // 오름차순으로 정렬했다.
                            int temp = arry[i];
                            arry[i] = arry[j];
                            arry[j] = temp; // temp로 arry[i]와 arry[j]의 순서를 바꿔치기했다.
                        }
                    }

                }
                System.out.println("가장 큰 수는 " + arry[length-1] + "두 번째로 큰 수는 " + arry[length-2] + "입니다.");
                System.out.println("프로그램을 종료하고 싶으시다면 \"끝\"이라고 입력해주세요. \n" +
                        "계속하기를 원하시면 아무 문자나 입력해 주세요.");
                scr.nextLine();
                if(scr.nextLine().equals("끝")){
                    break;
                }

            }







    }
}
