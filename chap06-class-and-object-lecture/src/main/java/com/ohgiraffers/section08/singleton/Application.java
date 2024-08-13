package main.java.com.ohgiraffers.section08.singleton;

public class Application {
    // 하나의 인스턴스를 돌려쓰기..

    public static void main(String[] args) {

        /*
        * singleton pattern 이란?
        * 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 힙 영역 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
        * 하나의 인스턴스를 공유해서 사용하며 메모리 낭비를 방지할 수 있게 함.(매번 인스턴스 생설할 필요가 없다.)
        *
        * 장점
        * 1. 첫 번째 이용시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만, 두 번째 이용 시에는 인스턴스 생성 시간 없이
        * 사용할 수 있다.
        * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보장할 수 있다.
        *
        * 단점
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다. (유지보수에 문제가 생길 수 있다.)
        * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
        * (데이터 베이스와 자바의 상호작용 중 데이버베이스에 영향을 줄 수 있는 인스턴스가 여러 개라면)
        *
        *
        * 싱글톤 구현 방법
        * 1. 이른 초기화
        * 2. 게으른 초기화
        * */

        // 이른 초기화
        // EagerSinglrton eager1 = new EagerSinglrton(); // 외부에서 인스턴스 생성을 봇하게 막아놨다.
        EagerSinglerton eager1 =  EagerSinglerton.getInstance();
        EagerSinglerton eager2 =  EagerSinglerton.getInstance();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode()); // 주소값이 같다.


        // 게으른 초기화
        LazySingleton lazy1 =  LazySingleton.getInstance();
        LazySingleton lazy2 =  LazySingleton.getInstance();

        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode()); // 주소값이 같다.

        /*
        * static
        * 정적 메모리 영역에 프로그램이 시작 될 때 할당하는 키워드이다.
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드와 메소드를 합쳐 부르는 말)에 지정할 수 있다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        *
        * 하지만 static 키워드릐 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야 할 방식이다.
        * 명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하는 게 좋다.
        * 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.
        *
        * */



    }
}
