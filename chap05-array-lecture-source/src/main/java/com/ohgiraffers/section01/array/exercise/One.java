package main.java.com.ohgiraffers.section01.array.exercise;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. // (잘하면 두번째로 큰 값도)
         *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력
         * */

        /* 어떤 수를 생각하십니까? 1보다 큰 정수를 입력해 주세요.
        (배열의 길이를 정하는 수이다.length)

        입력하신 숫자가 1보다 작습니다. 다시 입력해 주세요.
        (if문을 이용해 1보다 작은 값이 입력됐을 경우 출력되도록 만들고 다시 위로 올려 보낸다.)


        입력하신 수의 크기만큼 수를 반복해 넣어주세요. 실수여도 좋습니다.
        (if문으로 1보다 큰 수가 입력됐을 경우 출력되도록 만든다.)

        입력하신 숫자 중 가장 큰 숫자와 그 다음 큰 수가, firstMaxNum과 secondMaxNum이 맞습니까?
        (첫 번째 숫자로 선언된 배열에, 두 번째부터 입력되는 숫자들을 각각의 공간들에 부여합니다.
        이후 부여된 수들을 서로간에 비교하여 가장 큰 수와 두 번째로 큰 수를 뽑아냅니다.) */

        Scanner scr = new Scanner(System.in);

        System.out.println("----- 배열의 크기를 정하고 그 크기에 맞게 값을 할당해주시면 해당 값의 가장 큰값을 찾아드립니다. -----");

        System.out.println("배열의 크기를 정해주세요.");

        int arrlength = scr.nextInt();

        if (arrlength <= 1) {
            System.out.println("두 값의 비교를 위해선 배열의 크기가 1보다 커야합니다.");
            return;
        }
        int[] arr = new int[arrlength];
        System.out.println("값을 할당해주세요.");
        for (int i = 0; i < arrlength; i++) {
            arr[i] = scr.nextInt();
        }
        System.out.println("크기를 비교하는 중입니다. ... ");

        int biggstNum = arr[0];

        for (int i = 0; i < arrlength; i++) {
            if(arr[i] > biggstNum) {
                biggstNum = arr[i];
            }System.out.println(biggstNum);
        }

    }
}
