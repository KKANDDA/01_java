package main.java.com.ohigiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.
        *
        * - 장점 : 고유성 보장, 효율적인 데이터 테스트, 수학적 집합 연산 가능, list 에서 중복 제거 가능
        * */

        /*
        * HashSet
        * set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * 해시 알고리즘을 사용하여 검색 속도가 빠르다!!는 장점을 가진다.
        * */

        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java")); // 객체 생성
        hset.add(new String("jdbc"));
        hset.add(new String("mysql"));
        hset.add(new String("css"));
        hset.add("java"); // 값 자체
        System.out.println(hset);

        System.out.println(hset.size());

        System.out.println(hset.contains("java")); // 검색 기능
        System.out.println(hset.contains(new String("java"))); // 동등 객체면 같은 주소값이도록 오버라이딩 되어있다.

        // 1. toArray() 이용해 배열로 바꿈
        Object[] arr = hset.toArray(); // 반환 계열이 Object 라 오브잭트로..
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        // 2. iterater() 로 목록을 만든다.
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()/*토큰, 너 다음 것이 존재하니? 물어서 출력해준다.*/) {
            System.out.println(iter.next()); //
        }
        System.out.println(iter);
        System.out.println(iter.hasNext()); // 다음 요소들을 가지고 있니? 트루 펄스로 값을 배출..
        System.out.println("-------------------------");
        System.out.println(hset);

        hset.clear();
        System.out.println(hset.isEmpty());

    }

}
