package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 배열의 사용 방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        *
        * */


        // 자료형[] 변수명;
        // 자료형 변수명 []; 으로 선언할 수 있다.
        int[] iarray;
        int array[]; // c 스타일

        /*
        * 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다. 발생한 주소를 (레퍼런스주소)에 저장하여
        * 이것을 사용하기 때문에 참조자료형(레퍼런스타입)이라고 한다. // new 는 레퍼런스타입(!=프리미티브타입)을 반환하는 연산자이다.
        *
        * */

        // 배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 한다.

        iarray = new int[5];
        array = new int[4];

        // 선언과 할당을 동시에 할 수도 있다.
        int[] iarr2 = new int[5];
        System.out.println(iarr2);

        /*
        * char 배열만 특이하게 출력시 값 자체가 출력됨.
        * */

        char[] carr2 = new char[4];
        carr2[0] = 't';
        carr2[1] = 'e';
        carr2[2] = 's';
        carr2[3] = 't';
        System.out.println(carr2);

        System.out.println("iarray = " + iarray);
        System.out.println("array = " + array);
        System.out.println("iarr2 = " + iarr2);

        /*
        * hashCode()
        * 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 개체의 고유한 정수값을 반환한다.
        * 동일객체인지 비교할 떄 사용할 목적으로 쓰인다
        *
        * */

        System.out.println("iarray = " + iarray.hashCode());
        System.out.println("array = " + array.hashCode());
        System.out.println("iarr2 = " + iarr2.hashCode());

        // 스캐너를 통해 입력받은 정수로 배열 길이를 지정할 수 있다.
        Scanner scr =  new Scanner(System.in);
        System.out.println("할당할 배열의 길이를 입력해 주세요 : ");
        int size = scr.nextInt();

        int[] darr = new int[size];
        System.out.println("darr =" + darr.hashCode());
        System.out.println("darr = " + darr.length);


        // 한 번 지정한 배열의 크기는 변경하지 못한다. // 기존에 있던 것을 변경한 것이 아니라 새롭게 만들었다. 그래서 주소값이 다르다.
        darr = new int[30];
        System.out.println("darr =" + darr.hashCode());
        System.out.println("darr = " + darr.length);

        darr = null;
        System.out.println("darr.hashCode() + " + darr.hashCode());
        System.out.println("darr = " + darr.length); // 오류가 나삣다.







    }
}
