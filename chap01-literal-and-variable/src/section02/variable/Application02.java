package section02.variable;

import java.sql.SQLOutput;

public class Application02 {
    public static void main(String[] args) {
        /*
        변수를 선언하고 값을 할당하여 사용할 수 있다.

        변수를 사용하는 방법
        1. 변수를 준비한다. -선언
        2. 변수에 값을 대입한다. - 초기화
        3. 변수를 사용한다.

        변수에는 자료형이 존재한다.
        자료형이란? 다양한 값의 형태별로 어느 정도의 크기를
        하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드이다.
        예) 앞에서 사용한 int 자료형은 4byte 만큼을 읽어서
        하나의 값으로 취급하겠다는 약속이다.
        이러한 자료형은 기본자료형, 참조자료형으로 나우어 진다.
        그 중 기본 자료형 8가지를 먼저 확인한다.
        ************프리미 타입

        * 컴파일러는 내 코드를 계속해서 모니터링하고 있다.

        */

        System.out.println("--------------------------------------");


        // 목차 1-1 숫자를 취급하는 자료형
        // 1byte는 8개의 bit가 모여진 데이터 단위이다.
        // 자바는 기본적으로 데이터의 최소 단위를 1byte 만큼 취급한다.

        // 정수형

        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        // 실수형
        float fnum; // 4byte
        double dnum; // 8byte

        //목차 1-2 문자를 취급하는 자료형

        char ch; // 2byte
        System.out.println((char) 97); // 아스키코드

        // 목차 1-3 논리값을 취급하는 자료형
        boolean isTrue; // 1byte

        String str; // 배열 자료형으로 기본 자료형 이아니다. **** 레퍼런스 타입

        System.out.println("-------------- 변수 초기화 ------------");

        /*
        목차 2 변수에 값을 대입하기
        위에서 한 변수 선언은 메모리에 값을 저장하기 위해 공간만 생성해 둔 상태이다.
        그 공간에 대입 연사자를 이용하여 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
        만약. 약속 내용과 다른 형태의 값을 대입(=)하려고 하면 컴파일러는 에러를 발생시킨다.
            (문자 변수에 정수를 넣는 다거나.. 정수 변수에 실수를 넣는 다거나.)

        int num = 1;



        * */



        // 정수를 취급하는 자료형
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L; // long 타입은 뒤에 L을 명시
        System.out.println(lnum);



        // 실수를 취급하는 자료형에 값 대입
        fnum = 4.0f; // 끝에 f를 꼭 붙여야 사용 가능함. lnum과 달리 f를 꼭 넣어줘야 함.
        dnum = 4.0;  // 실수형에 정수를 넣어도 출력은 실수로 나온다. *dnum = 4; 값은 4.0으로 출력됨.

        // 문자를 취급하는 자료형에 값 대입

        ch = 'a'; // char(캐릭터)는 문자 대응 변수라 "(쌍따옴표)를 사용할 수 없다. "를 문자열로 인식하기 때문이다.

        System.out.println(ch); // a!!!


        ch = 'b'; /* 이렇게 변수에 다시 초기화를 진행하면 상기한 변수까지는 이전 초기화 값이 출력하는 형태로 유지되고,
                     다음부터는 바뀐 초기화 값이 출력된다.
                   */

        System.out.println(ch); // b!!!



        char ch2 = 97;
        System.out.println(ch2);


        // 논리형을 취급하는 자료형에 값 대입

        isTrue = true;
        System.out.println(isTrue);
        isTrue = false;
        System.out.println(isTrue);



        // 문자열을 취급하는 자료형에 값 대입 (기본 변수는 아니지만..)

        str = "안녕하세요"; // '(홀따옴표)는 문자열 변수엔 사용할 수 없다.

        /*
        숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double 이다.
        일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형 이라고 하며,
        정수는 int, 실수는 double 이것이 대표 자료형이다.

        int inum; // 4byte 대표!!
        long lnum; // 8byte

        // 실수형
        float fnum; // 4byte
        double dnum; // 8byte 대표!!


        */

        System.out.println("bnum의 값 :" + bnum);
        System.out.println("snum의 값 :" + snum);
        System.out.println("inum의 값 :" + inum);
        System.out.println("lnum의 값 :" + lnum);

        System.out.println("fnum의 값 :" + fnum);
        System.out.println("dnum의 값 :" + dnum); // 문자열과 다른 형태의 값은 제일 큰 개념인 문자열로 출력된다.


        System.out.println("isTrue의 값 :" + isTrue);

        System.out.println("str의 값 :" + str);


        // 변수를 이용해서 연산하기

        int point = 100 + 100; /* 선언과 초기화를 동시에 할 수 있다. 그러나 초기화는 여러번 할 수 있지만, 선언은 한 번만 가능하다.
                            컴파일러나 허락하지 않는다. "넌 못 지나간다."
                         */
        int bounus = 10;

        // 변수에 저장된 값을 이용해 연산할 수 있다.
        System.out.println("포인트와 보너스의 합은 : " + (point + bounus));

        point = point + 100;
        System.out.println(point + bounus);





    }
}
