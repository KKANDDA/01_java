package main.java.com.ohgiraffers.section02.string;

public class Application01 {
    public static void main(String[] args) {

        /*
        * charAt() : 해당 문자열의 특정 민덱스에 해당하는 문자를 반환
        * 인덱스는 0부터 시작하는 숫자 체계를 의미하며,
        * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는
        * IndexOutOfBoundException 이 발생한다. [벌건글씨 ㅋㅋ]
        *
        *
        * */
        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt("+i+") : " + str1.charAt(i));
        }

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
        * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        *
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));

        System.out.println("compareTo() : " + (str2.compareTo(str4)));

        System.out.println("compareTo() : " + (str2.compareTo(str5)));

        /*
        * concat() : 문자열에 인자로 전달된 문자열을 합쳐 새로운 문자열을 반환한다. 원본에는 영향을 주지 않는다.
        *
        * */

        System.out.println("concat() : " + (str2.concat(str5)));
        System.out.println("str2 = "+ str2); // 원본에는 영향을 주지 않는다. 값을 담고 싶다면 따로 선언해야 한다.

        /*
        * indexOf() : 문자열에서 측정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우는 -1을 반환한다.
        * */

        String indexOf = "java orcle";
        System.out.println(indexOf.indexOf('a'));
        System.out.println(indexOf.indexOf('z'));

        /*
        * lastIndexOf() : 뒤에서부터 탐색해 일치하는 위치의 인덱스 반환
        * */

        System.out.println(indexOf.lastIndexOf('a'));
        System.out.println(indexOf.lastIndexOf('z'));

        // trim() : 문자열의 앞 뒤 공백 제거 후 반환

        String trimStr = "      java      ";
        System.out.println("trimStr : #"+trimStr+"#");
        System.out.println("trimStr : #"+trimStr.trim() + "$");

        /*
        * toLowerCase() : 모든 문자 소문자 변환
        * toUperCase() : 모든 문자 대문자 변환
        *
        * */

        String caseStr = "javaOracle";
        System.out.println(caseStr.toLowerCase());
        System.out.println(caseStr.toUpperCase());

        /*
        * subString() : 문자열의 일부분을 잘라내어 새로운 문자열 반환
        * 원본에는 영향을 주지 않는다.
        * */

        String javaOracle = "javaOracle";

        System.out.println(javaOracle.substring(3)); // 시작 인덱스
        System.out.println(javaOracle.substring(3,6)); // 시작 인덱스, 끝 인덱스

        /*
        * replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환
        * 원본에는 영향을 주지 않는다.
        *
        * */

        System.out.println(javaOracle.replace("java", "phython"));

        /*
        * isEmpty() 문자열의 길이가 0이면 true, 아니면 false 반환.
        * */

        System.out.println("isEmpty : " + "".isEmpty());
        System.out.println("isEmpty : " + "abc".isEmpty());


    }
}