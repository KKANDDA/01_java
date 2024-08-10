package main.java.com.ohgiraffers.section01.array;

import java.util.Random;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        Random random = new Random(); // Random 클래스에서 import 하여 클래스를 불러왔다.
        random.nextInt();

        String[] trumpShape = {"스페이드", "하트", "클로바", "다이아몬드"};
        String[] trumpNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};

        int aTurn = random.nextInt(4);
        int bTurn = random.nextInt(12);

        System.out.println(trumpShape[aTurn] + trumpNum[bTurn]);

        System.out.println("---------------------------------------------------------------------------------");

        /*배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고, 첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요.
        (잘하면 두번째로 큰 값도) (더 잘하면 중복값을 찾아내서 다시 입력해 달라고 요청하는 것도)

        만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두 번째로 큰 수를 찾을 수 없습니다."를 출력해 주세요.

        ...

        어떤 수를 생각하십니까? 1보다 큰 정수를 입력해 주세요.
        (배열의 길이를 정하는 수이다.length)

        입력하신 숫자가 1보다 작습니다. 다시 입력해 주세요.
        (if문을 이용해 1보다 작은 값이 입력됐을 경우 출력되도록 만들고 다시 위로 올려 보낸다.)


        입력하신 수의 크기만큼 수를 반복해 넣어주세요. 실수여도 좋습니다.
        (if문으로 1보다 큰 수가 입력됐을 경우 출력되도록 만든다.)

        입력하신 숫자 중 가장 큰 숫자와 그 다음 큰 수가, firstMaxNum과 secondMaxNum이 맞습니까?
        (첫 번째 숫자로 선언된 배열에, 두 번째부터 입력되는 숫자들을 각각의 공간들에 부여합니다.
        이후 부여된 수들을 서로간에 비교하여 가장 큰 수와 두 번째로 큰 수를 뽑아냅니다.)
        */
        Scanner scr = new Scanner(System.in);
        System.out.println("---- 배열 안의 큰 수 찾기 ---- \n" +
                "배열의 크기를 정해주세요. 1보다 큰 정수를 입력해 주세요.");
        int length = scr.nextInt();
        double[] arry = new double[length];

        if (length <= 1) {
            System.out.println("입력하신 숫자가 1보다 작습니다. 다시 입력해 주세요.");
            return;
        }
        System.out.println("좋습니다. 입력하신 수의 크기만큼 수를 반복해 넣어주세요. \n" +
                "순서 상관없이 넣으셔도 가장 큰 수와 두 번째 큰 수를 찾아드립니다. (정수가 아닌, 실수여도 좋습니다.)");
        for (int i = 0; i < length; i++) {
            arry[i] = scr.nextDouble();
        }
        System.out.println("큰 수와 작은 수를 찾는 중 입니다. \n"+"... ... .");

        double big = arry[0];
        double secondBig = arry[0];
        for (int i = 0; i < length; i++) {
            if(arry[i] > big){
                secondBig = big;
                big = arry[i];
            }else if(arry[i] > secondBig || secondBig == big);
            secondBig = arry[i];
        }
        if(big == secondBig){
            System.out.println("입력하신 수가 앞선 수와 같습니다.\n" +
                "처음부터 다시 입력해 주세요.");
            return;
        }System.out.println("가장 큰 수는 " + big + "두 번째 큰 수는 " +secondBig+ "입니다.");
    }
}
