package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Application01 {
    public static void main(String[] args) {

        // 위에서 배운 예외처리를 가장 많이 사용하는 곳이 io(input/output) 패키지이다.

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat")); // 테스트 데 파일을 읽어 올 수 없을 때를 대비한다.
        } catch (FileNotFoundException e) {
            System.out.println("여기서 에러 발생");
            e.printStackTrace();
        }finally {
            System.out.println("finally 실행");
        }

    }
}
