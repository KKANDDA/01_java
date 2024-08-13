package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class Application03 {
    public static void main(String[] args) {
        // 선택 정렬
        int[] iarr = {2, 5, 4, 1, 6, 3}; // 1 5 4 2 6 3

        int min;
        int temp;

        for (int i = 0; i < iarr.length; i++) { // 1
            min = i;
            for (int j = i + 1; j < iarr.length; j++) { // 2
                if (iarr[min] > iarr[j]) { // 2>5거짓j++  2>4거짓j++  2>1참min4대입   temp=iaar[4]가 담김
                    min = j;
                }
            }
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println("배열의 크기와 요소를 정하고, 요소들의 크기를 선택 정열로 나열하여 큰 수와 두 번째 큰 수를 찾아내기.");

        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("배열의 크기를 정하세요.");
            int length = scr.nextInt();
            if (length > 1) {
                System.out.println("배열의 요소를 정하세요.");
            } else {
                System.out.println("배열의 크기를 2이상으로 정해주세요.");
                continue;
            }
            System.out.println("큰 수와 두 번째 큰수를 찾고 있습니다.");

            double[] arry = new double[length];
            int arryTemp;
            int arryMin;
            for (int i = 0; i < length; i++) {
                arryMin = i;
                for (int j = 0; j < length; j++) {
                    if (iarr[arryMin] > iarr[j]) {
                        arryTemp = iarr[j];
                    }
                }
                // arry[temp] = arryMin;
                // arryMin = arry[i];
                // arry

            }

        }


    }
}
