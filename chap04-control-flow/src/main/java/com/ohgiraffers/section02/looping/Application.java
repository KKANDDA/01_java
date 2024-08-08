package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {



        A_for a = new A_for();
        // a.testSimpleForStatement();
        // a.printGugudan();
        // a.testForExample();
        // a.testForExample2();
        // a.testForExample3();
        // a.primeNumber();

        B_nestedFor b = new B_nestedFor();
        // b.printGugudanFromTwoToNine();
        // b.printUpgradeGugudan();
        // b.printStars();
        // b.printStars2();

        C_while c = new C_while();
        // c.testSimpleWhileStatement();
        // c.testWholeExample1();
        // c.testWhileExample3();

        D_doWhile d = new D_doWhile();
        // d.testSimpleDoWhileStatement();
        d.testDoWhileExample();
    }
}
