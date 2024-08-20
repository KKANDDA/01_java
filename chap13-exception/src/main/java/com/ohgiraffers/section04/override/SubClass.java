package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{

    // 예외 없이 오버라이드 할 수 있다.

    /*
    @Override
    public void method(){} // 정상
    */
        // 같은 예외를 던져주는구문으로 오버라이딩 할 수 있다.
    /*
    @Override
    public void method() throws IOException{} // 정상
    */

        // 부모의 예외보다 상위의 예외로는 할 수 없다.
    /*
    @Override // IO익셉션은 익세션의 하위이기에 상속 받는 입장에서 더 큰 예외 처리를 오버라이드 할 수 없는 것이다.
    public void method() throws Exception {} // 불가능
    */
        // 하지만 하위로는 할 수 있다. (즉 더 구체적인 상황)
    @Override // 파일낫파운드익셉션은 IO익셉션의 하위라 오버라이드가 가능하다.
    public void method() throws FileNotFoundException{}


}
