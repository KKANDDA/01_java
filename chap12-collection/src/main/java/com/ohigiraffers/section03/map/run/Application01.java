package main.java.com.ohigiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Map
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키와 값을 한 쌍으로 저장하는 방식을 사용한다.
        * 인덱스 대신에 키 사용
        *
        * 키(key)?
        * : 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복 값은 저장 가능하다.
        *
        * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있지만,
        * HashMap 이 제일 많이 사용된다.
        * */

        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(2, "redApple"); // 오토박싱, 키값은 인스턴스만 가능
        hmap.put(3.3, 123);
        System.out.println(hmap);

        hmap.put(2, "yellow"); // 키는 중복 저장이 불가
        System.out.println(hmap);

        hmap.put(3,"yellow"); // 값은 중복 저장이 가능

        // 값을 가져올 때 get()
        System.out.println("키 \"one\" 에 대한 값 : " + hmap.get("one")); // 키는 인덱스 번호가 아니다.
        /*
        * userName : 서현준
        * userId : diob
        * 키       밸류
        * */

        // 키 값 삭제 처리 remove()
        hmap.remove("one");
        System.out.println(hmap);

        System.out.println(hmap.size());

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "java17");
        hmap2.put("two", "musql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        // keySet() 이용해서 키만 따로 set으로 만들고, iterator 로 키에 대한 목록을 만든다.
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " : " + value);
        }

        Collection<String> values = hmap2.values();

        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        // Map 의 내부에 존재하는 EntrySet 을 이용 // 키와 밸류가 묶인 것
        Set<Map.Entry<String,String>>set = hmap2.entrySet();

        Iterator/*반복자*/<Map.Entry<String,String>> entryIter = set.iterator();

        while (entryIter.hasNext()) {
            Map.Entry<String,String> entry = entryIter.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

}
