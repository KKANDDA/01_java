package main.java.com.ohgiraffers.section04.scanner;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class RandomNumber {
public String random (int a){

    int ran = (int)((Math.random() * 200)-101);

    return ((ran > 0) && (ran % 2 == 0))? ran + "는 양수면서 짝수입니다." : ((ran > 0) && (ran % 2 == 1))? ran + "는 양수면서 홀수입니다." :
            (ran == 0)? ran + "는 0입니다." :
                    ((ran < 0) && (ran % 2 == 0))? ran + "는 음수면서 짝수입니다." : ran + "는 음수면서 홀수입니다.";
}

public static String random2 (int a){

    int ran = (int)((Math.random() * 200)-101);

    return ((ran > 0) && (ran % 2 == 0))? ran + "는 양수면서 짝수입니다." : ((ran > 0) && (ran % 2 == 1))? ran + "는 양수면서 홀수입니다." :
            (ran == 0)? ran + "는 0입니다." :
                    ((ran < 0) && (ran % 2 == 0))? ran + "는 음수면서 짝수입니다." : ran + "는 음수면서 홀수입니다.";
}

}
