package main.java.com.ohigiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 컬렉션 프레임워크
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        * 즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다.
        * */

        /*
        * Collection 은 크게 3가지 인터페이스 중 한 가지를 상속 받아 구현했다.
        * 1. List 인터페이스
        * 2. Set 인터페이스
        * 3. Map 인터페이스
        *
        * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
        * 하지만 Map 은 구조상의 차이로 정의하고 있지 않다.
        *
        * 각 인터페이스 별 특징
        *
        * 1. List 인터페이스
        * - 순서 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
        * - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        * 2. Set 인터페이스
        * - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
        * - HashSet, TreeSet 등이 있다.
        * 3. Map 인터페이스
        * - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
        * - key 를 Set 방식으로 관리하기 때문에 데이터 순서를 관리하지 않고, 중복된 key 를 허용하지 않는다.
        * - HashMap, TreeMap, HashTable, Properties 등이 있다.
        * */

        /*
        * ArrayList
        * - 가장 많이 사용되는 컬렉션 클래스이다.
        * - 내부적으로 배열을 이용하여 요소를 관리하며,
        * 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
        *
        * ArrayList 는 배열의 단점을 보완하기 위해 만들어졌다.
        * 배열의 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬이 복잡하다는 단점을 가지고 있다.
        * ArrayList 는 이런 단점을 보완하고자 크기변경, 요소 추가, 삭제, 정렬 기능을 미리 메소드로 구현해서 제공하고 있다.
        * 자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
        * */

        ArrayList alist = new ArrayList(); // 자동으로 10칸이 만들어졌다. 넘어가게 되면 새롭게 큰게 만들어진다.(주소값이 바뀌어서 새로 만들어진다)
        List list = new ArrayList();
        // list = new LinkedList(); // 유연성을 위해 사용하곤 한다.. 그렇다능..

        Collection clist = new ArrayList<>(); // 컬렉션과 리스트 사이에 이동이 가능하다. 근데 보통은 List 를 많이 쓴다.

        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new Date());

        System.out.println(list); // toString 이 이미 오버라이드 되어있다.

        System.out.println("list.size() = " + list.size()); // 들어간 갯수를 알려준다.

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " = " + list.get(i));

        }

        list.add("apple");
        System.out.println("list = " + list); // 중복 저장도 가능하다. 마지막에 추가된다.

        // 원하는 인덱스 위치에 값을 추가할 수도 있다.
        list.add(1,"banana");
        System.out.println("list = " + list); // 말그대로 추가!! 다음 번호들이 밀린다. 삭제를 하면 당겨진다.

        // remove()
        list.remove(2);
        System.out.println("list = " + list); // 당겨졌다. 이런 부분들이 성능적으로 안 좋다는 이야기다.

        // set() : 지정된 위치의 값 수정
        list.set(1, "melon");
        System.out.println("list = " + list);

        // 모든 컬렉션 프레임워크는 제네릭 클래스로 되어있다.
        List<String> stringsList = new ArrayList<>();
        stringsList.add("apple");
        stringsList.add("banana");
        stringsList.add("orange");
        stringsList.add("mango");
        // stringsList.add(212); // 다른 타입은 안 된다. 왜냐고? 스트링 타입으로 제네릭을 걸었으니까!!
        System.out.println("stringlist = " + stringsList);

        /*
         * Collections
         * collection 에서 사용되는 기능들을 static 메소드로 구현해 놓은 클래스
         * */

        Collections.sort(stringsList); // 오름차순으로 정렬했다.
        System.out.println("stringlist = " + stringsList);




    }
}
