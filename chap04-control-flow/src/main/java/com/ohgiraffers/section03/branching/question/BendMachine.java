package main.java.com.ohgiraffers.section03.branching.question;

import java.util.Scanner;

public class BendMachine {
    public void bendMachine() {

        Scanner scr = new Scanner(System.in);

        System.out.println("음료를 선택해 주세요. \n" +
                " 사이다(500) " + " 콜라(600) " + " 환타700 " + " 박카스(1000) " + " 핫식스(1500) ");

        String saida = "사이다";
        String cola = "콜라";
        String hwanta = "환타";
        String bakas = "박카스";
        String hotsix = "핫식스";

        String drinkName = scr.nextLine();

        //boolean yes = true;
        //String true . "네";

        if(drinkName.equals(saida)) {
            System.out.println("사이다를 선택하셨습니다." +
                    "맞으신가요? - 네 / 아니오");
        }
        String yes = "네";
        String no = "아니오";
        String answer = scr.nextLine();

        if(answer.equals(yes)){

        }
        System.out.println("계산하시겠습니까? - 네 / 아니오");


        if(answer.equals(yes)){
            System.out.println("500원입니다.");
        }
    }
    public void machine(){
        System.out.println("---------------------- vendig machine ------------------");
        System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)");
        System.out.println("--------------------------------------------------------");
        System.out.println("음료를 선택해 주세요.");

        Scanner scr = new Scanner(System.in);
        String selectedDrink = scr.nextLine();

        int price = 0;

        switch(selectedDrink){
            case "사이다" : price = 500; break;
            case "콜라" : price = 600; break;
            case "환타" : price = 700; break;
            case "박카스" : price = 1000; break;
            case "핫식스" : price = 1500; break;
        }

        // if(selectedDrink.equals(switch)){
        // System.out.println(selectedDrink + "를 선택하셨습니다.");
        // System.out.println(price + "원을 투입해 주세요.");
    }
    public void machine2(){
        /*
         * 자판기를 만들어 보자.
         * 자판기가 파는 음료는 사이다(500) 콜라(600) 환타(700) 박카스(1000) 핫식스(1500)
         * 잘목된 음료수가 선택되면 다시 받아야 한다.
         *
         * 음료수를 선택하면 계산 여부를 물어본 후계산을 고르면 총 금액과 고른 음료수를 출력해 주어야 한다.
         *
         * 예시)
         * 음료를 선택해 주세요.
         *
         * 사이다
         * 사이다를 선택하셨습니다.
         * 계산하시겠습니까?
         * 네                                         아니요
         * 총 상품은 사이다                             음료를 더 선택해 주세요
         * 총 금액은 500원 입니다.                      콜라
         *                                           콜라를 선택하셨습니다.
         *                                           계산하시겠습니까?
         *                                           네
         *
         * */
        /*
        * 총 금액, 총 상품 변수 선언
        * 무한루프 반복문 만들기
        * 스캐너로 음료 받기
        * 스위치로 해당 음료 가격 상품명 총 금액, 변수 추가 +=
        * 쇼핑을 계속 할 건지 묻기
        * 쇼핑을 그만하고자 하면 break를 이용 무한루프 끊고 총 금액, 총 상춤 출력
        * 쇼핑을 계속하고자 하면 음료를 더 선택해 달라고 출력 후, 반복문 다시 반복
        * */

        Scanner scr = new Scanner(System.in);
// static 이 없는 Scanner 클래스 를 선언.
        System.out.println("---------------------- vendig machine ------------------");
        System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)");
        System.out.println("--------------------------------------------------------");
// 자판기 초기 설명문 출력.
        int allSumPrice = 0; // int 정수 자료형이기에 정수를 받을 수 있도록 준비해 놓는다.
        String allDrink = ""; // String 은 문자열 자료형이기에 문자열만 받을 수 있기에 "" 로 명확히 초기값을 설정한다.
// 최종적으로 출력해 줄 변수들을 선언 및 초기값 설정.
        System.out.println("음료를 선택해 주세요.");
// 자판기 동작을 유도하는 출력문.
        for(;;){ // while(true){} 로도 무한루프를 만들 수 있다. 여기서 빙글빙글 돌며 계속 작업을 수행한다. break; fh 닫기 전까지..!
            String selectedDrink = scr.nextLine(); // 사용자로부터 변수을 입력받는다. nextLine 는 문자열 변수이다.
            switch(selectedDrink){ // switch 는 비교 변수를 설정해 놓고, 사용자로부터 변수를 받아, case 에 담아둔 변수와 비교하여 true 면 : 이하의 값을 출력한다.
                case "사이다" : // 사용자가 입력한 변수와 비교할 변수.
                    System.out.println("사이다요? 흐음..?! 500원이요.");
                    allDrink += "사이다 "; allSumPrice += 500;  break; // switch 문에서 break; 는 비교 후 출력될 값을 정해주는 수행한다.
                case "콜라" :
                    System.out.println("콜라! 아~주 져아여~! 600원이요~");
                    allDrink += "콜라 "; allSumPrice += 600; break;
                case "환타" :
                    System.out.println("환타. 애송이시군요. 700원이요.");
                    allDrink += "환타 "; allSumPrice += 700;break;
                case "박카스" :
                    System.out.println("박카스.. 실홥니까? 1000원입네다.");
                    allDrink += "박카스 "; allSumPrice += 1000; break;
                case "핫식스" :
                    System.out.println("핫식스!! 고생이 많으십니다. 1500원입니다.");
                    allDrink += "핫식스 "; allSumPrice += 1500; break;
                default: // default 를 해주지 않으면 사용자가 switch 에 등록된 값 이외의 것을 입력할 때에 오류가 난다.
                    System.out.println("그런건 읎어요..!"); // 비교해서 true가 나올 수 있는 값이 입력되지 않았기 때문에 default 로 닫고 다시 무한루프로 돌려 보냈다.
                    continue; /////////////////////////////////////////////////////
            }
            System.out.println("무튼, 계속 주문하시겠어요? - 네 / 아니오");
            String yes = scr.nextLine();
            if(yes.equals("네")){
                System.out.println("네네~ 계속 주문해 주세요.");
            }else if(yes.equals("아니오")){
                System.out.println("그럼 계산해 드릴게요~"); break;
            }
        }
        System.out.println("선택하신 음료는 " + allDrink + "가격은 " + allSumPrice + "원 입니다. \n" +
                "안녕히 가셔유~");
    }

}
