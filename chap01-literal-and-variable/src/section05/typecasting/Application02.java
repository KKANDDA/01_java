package section05.typecasting;

public class Application02 {
    public static void main(String[] args) {


        /*
        * 강제 형변환
        * 바꾸려는 자료형으로 캐스팅 연산자를 이용하여 형변환한다.
        *
        * */

        /*
        * 자동 형변환 규칙과 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요
        *   1-2. 실수를 정수로 변경 시 강제 형변황 필요
        *   1-3. 문자형을 int 미만의 그기의 변수에 저장할 대 강제 형변환 필요
        *   1-4. 논리형은 강제 형변환 규칙에서 제외
        *
        * */

        // 큰 자료형에서 작은 자료형으로 변경시 강제 형변환

        // 정수간의 강제 형변환

        long lnum = 8L;
        int inum = (int)lnum; // 데이터 손실의 위험 때문에 컴파일러가 에러를 발생시킨다. 그렇기에 강제 형변환(int)을 해주어야 한다.
        short snum = (short)inum;
        byte bnum = (byte)snum;
        System.out.println(bnum);

        // 실수 간의 강제 형변환

        double dnum = 8.0;
        float fnum = (float)dnum; // 마찬가지로 데이터 손실의 위험이 있기에 (float)로 형변환을 해주어야한다.

        // 실수를 정수로 변경 시 강제 형변환이 필요
        float fnum2 = 4.62644f; // 실수가 정수로 형변환이 일어날 때는 소수점은 버리고 출력된다.
        long lnum2 = (long)fnum2;// 데이터 손실의 위험이 있기에 형변환(long)을 해주었다.
        System.out.println(lnum2);

        // 문자형 int 미만 크기의 변수에 저장할 때는 강제 형변환이 필요하다.
        char ch = 'a';
        int inum2 = ch; // 문자를 정수로 바꿀 때 기본 자료형이 int이기에 대응하는 숫자로 자동으로 형변환이 된다.

        byte bnum2 = (byte)ch;
        short snum2 = (short)ch;

        // 정수를 문자에 대입 시 강제 형변환이 필요하다.

        char ch3;
        int inum5 = 9600001;

        ch3 = (char)inum5;
        System.out.println(ch3);


        // boolean 은 형변환에서 제외된다.




    }
}
