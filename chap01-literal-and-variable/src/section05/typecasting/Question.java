package section05.typecasting;

public class Question {
    public static void main(String[] args) {


        /*
        * 5명의 반 항색이 있으며 키는 각각
        * 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        * 우리는 학생의 평군 키를 구해서 화면에 보여주고자 한다.
        * 소수자리는 절삭한다.
        *
        * */

        float aStudent = 178.5f;
        float bStudent =  170.3f;
        float cStudent = 190.7f;
        float dStudent = 188.67f;
        float eStudent = 160.8f;

        long everyStudent = (long)(aStudent + bStudent + cStudent + dStudent + eStudent);

        System.out.println(everyStudent/5);
        System.out.println((long)(aStudent + bStudent + cStudent + dStudent + eStudent)/5);


        long lnum = 10l;
        int num =190;

        int sum = (int)lnum + num;
        int sum2 = (int)(num + lnum);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum + sum2);

        System.out.println("----------------");

        /*
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        *
        * 소득은 다음과 같다.
        *
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        *
        * 다음과 같이 출력해 주세요.
        * 홍길동의 총 매출은 --원 입니다.
        * 부가세 제외 소득은 --원 이고 부가세는 --원 입니다.
        *
        *
        *
        * */

        char $ = '원';

        int inun1 = 150400;
        int inun2 = 1400;
        int inun3 = 25000;
        int inun4 = 30000;

        int sumAll = inun1 + inun2 + inun3 + inun4;

        float texRate = 0.10f;

        float texExclusion = sumAll - (sumAll * texRate);
        float tex = sumAll - texExclusion;


        System.out.println("홍길동의 총 매풀은 " + sumAll + "원 입니다.");
        System.out.println("부가세를 제외한 소득은 " + texExclusion + "이고 부가세는 " + tex +"원 입니다.");








    }
}
