package main.java.com.ohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {

        // parsing : 문자열 값을 기본자료형으로 변경하는 것

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4"); // 많이 사용하게 될 것..!
        long l = Long.parseLong("8"); // L은 사용 못함..
        float f = Float.parseFloat("4.0f"); // f 는 사용 가능..!
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");
        // char 는 없다.

        System.out.println(l);

        System.out.println(i);
    }
}
