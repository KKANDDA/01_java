package section01.literal;

import java.sql.SQLOutput;

public class Application02 {
    public static void main(String[] args) {

        // 정수 리터럴 연산 형식의 값을 연산 한다.


        /*
          123 + 123
          123 - 456
          123 * 456
          40 / 10
          10 % 2

         */
        System.out.println(123 + 123);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);
        System.out.println("앞으로도 잘 할 수 있겠죠?");
        /*
        쌍따옴표는 문자열(한 글자 이상의 문자), 따옴표는 단일 문자
        System.out.println("2+2");
        */

        System.out.println("---------------------------------");
        // 실수와 정수 연산

        System.out.println(1+0.5);
        System.out.println(1-0.5);
        System.out.println(1*0.5);
        System.out.println(1/0.5);
        /*
        정수보다 실수가 더 큰 포괄하는 개념을 가지고 있다. 값은 2지만 2.0으로 출력된다.
        */
        System.out.println(1%0.4);


        System.out.println("-----------------------------------");
        // 문자와 문자의 연산
        System.out.println('a'+'b');
        /*
        컴퓨터는 0, 1 밖에 모른다. 각각의 문자는 0과 1로 이루어진 코드를 가지고 있고,
        각각 대응하는 숫자들이 있다.
        영어는 (아스키코드), 영어 외 언어 (유니코드)
         */
        System.out.println('ㄱ'+'ㄴ');

        // 문자열은 + 연산만 가능하다.
        // 데이터 값이 다를 때는 자동 현변환을 통해 최상위 타입으로 변경된다.
        // (문자열이 최상위 타입)

        System.out.println("------ 문자 열과 다른 형태의 값 연산 -------------");

        System.out.println("hello"+1004);
        System.out.println("hello"+true);
        /*
        문자열은 최상위 개념으로 문자열과 정수의 연산은
        하위 개념의 정수를 올려쳐서 문자열로 읽어 출력한다.
         */

        System.out.println("hello" + 123+456+"world");
        /*
        정수를 더하고 문자열의 값을 얻고 싶다면..! ()를 이용한다.
         */


        System.out.println("--------------------------");

        // 논리값 연산

        // System.out.println(true + 1); 불가능
        // System.out.println(true + false);
        System.out.println(true + "false");

        /*
        논리값은 정수와 연산이 불가
        논리값과도 불가
        논리값와 문자열은 가능
        */



    }
}