package main.java.com.ohgiraffers.section01.array;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        *
        *
        * 배열을 사용하는 이유?
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1. 연속된 메모리 공간으로 관리할 수 없다. // 모든 변수를 사용자가 관리해야한다는 뜻이다.
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println(sum);

        int[] array = new int[5]; // 할당할 때는 실제 사용할 배열의 갯수로 하고, 배열을 할당한 값에 접근할 때는 인덱스를 사용한다.

        // 하나의 이름으로 관리되는 연속된 메모리 공간. 인덱스를 이용해 접근
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[5] = 60; 문법은 맞기에 컴파일러가 문제를 찾지 못한다. 그러나 작동시에 문제가 생긴다.

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) { // length 는 배열의 길이를 알려주는 명령어다.
            sum2 += array[i];
        }
        System.out.println(sum2);

    }
}
