package main.java.com.ohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 문자열 분리
        * - 문자열을 특정 구분자로 분리한 문자열을 반환하는 기능
        *
        * split() : 정규표현식을 이용하여 문자열을 분리한다.
        * 비정형와된 문자열을 분리할 때 좋지만 정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
        * 정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정이다.
        *
        * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        * 정형화된 문자열 패턴을 분리할 때 사용하기 좋다.
        * splipt 보다 속도면에서 더 빠르다.
        * */

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부"; // 주소 없음
        String emp3 = "300/이순신/경기도/"; // 부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println("emArr1["+i+"]: " + empArr1[i]);
        }
        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("emArr1["+i+"]: " + empArr2[i]); // 공백도 인식함.
        }
        for (int i = 0; i < empArr3.length; i++) {
            System.out.println("emArr1["+i+"]: " + empArr3[i]); // 공백이 없어 인식하지 못함.
        }

        String[] empArr4 = emp1.split("/", -1); // 음수로 쪼개면 끝까지 나눠서 출력한다.
        for (int i = 0; i < empArr4.length; i++) {
            System.out.println("empArr4["+i+"] : " + empArr4[i]);

        }
        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()) { // 토큰으로 나눈다.
            System.out.println("st1 : " + st1.nextToken());
        }
        while (st2.hasMoreTokens()) { // 토큰으로 나눈다.
            System.out.println("st2 : " + st2.nextToken());
        }
        while (st3.hasMoreTokens()) { // 토큰으로 나눈다.
            System.out.println("st3 : " + st3.nextToken()); // 공백 무시
        }

        String colorStr = "red*orange#blue/yello green"; // 정규표현식이 아님..

        /*String[] colors = colorStr.split("*#/ ");*/ // 그러니 쓸수 없다.

        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr,"*#/ ");
        while (colorStringTokenizer.hasMoreTokens()){
            System.out.println(colorStringTokenizer.nextToken());
        }

    }
}
