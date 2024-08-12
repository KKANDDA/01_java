package main.java.com.ohgiraffers.section06.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + i++);
        }
        System.out.println();
        iarr[0] =99;
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }

    public void testClassTypeParameter(RectAngle rectAngle){
        /*
        * 인스턴스도 주소가 전달된다.
        * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는
        * 서로 동일한 인스턴스를 가리킨다. (얕은 복사)
        * */
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 =====");
        rectAngle.calcArea();
        rectAngle.calcRound();
        System.out.println("변경 후 사각형의 넓이와 둘레 =====");
        rectAngle.setWeight(100);
        rectAngle.setHeight(100);
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    public void testVariableLengthArrayParameter(String name, String.../*값이 아예 없어도 될 때 사용, 가변형 매개변수이다*/ hobby){
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : ");
        for(String hobbys:hobby){ // 향상된 for 문
            System.out.println(hobbys + " ");
        }
        System.out.println();
    }

}
