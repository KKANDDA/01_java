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

        System.out.println("---------------------- vendig machine ------------------");
        System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)");
        System.out.println("--------------------------------------------------------");

        int allSumPrice = 0;
        String allDrink = "";

        System.out.println("음료를 선택해 주세요.");

        for(;;){
            String selectedDrink = scr.nextLine();
            switch(selectedDrink){
                case "사이다" :
                    System.out.println("사이다요? 흐음..?! 500원이요.");
                    allDrink += "사이다 "; allSumPrice += 500;  break;
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
                default:
                    System.out.println("그런건 읎어요..!");
                    continue;
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
