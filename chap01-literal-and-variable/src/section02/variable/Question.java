package section02.variable;

public class Question {
    public static void main(String[] args) {


        /*
        * 김경리가 4명의 직원의 웘급을 입금해줘야 하는 날이다.
        * 각각 직책은 대리/ 과장/ 차장. 부장 이며,
        * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        * 보너스는 각 월급 *0.5 만큼을 주어야 한다.
        *
        *
        * 화면에 다음과 같이 출력되게 해주세요
        * ex) 김대리의 월급은 100만원 + 보너스 50 만원으로 총 150만원 입금 되었습니다.
        *
        * 4명 다 출력
        */

        System.out.println("김대리의 월급은 100만원 + 보너스 50 만원으로 총 150만원 입금 되었습니다.");

        System.out.println("----------------------------------- 실습---------------------");

        String position1 = "대리";
        String position2 = "과장";
        String position3 = "차장";
        String position4 = "부장";

        String lastMent = (" 입금 되었습니다.");

        String salary = "월급";

        String tenThousand = "만원";

        int salary1 = 100;
        int salary2 = 120;
        int salary3 = 130;
        int salary4 = 150;

        String bonus = "보너스";
        int salary1Bonus =  (int) (salary1 * 0.5);
        int salary2Bonus =  (int) (salary2 * 0.5);
        int salary3Bonus =  (int) (salary3 * 0.5);
        int salary4Bonus =  (int) (salary4 * 0.5);

        System.out.println("김" + position1 + "의 " + salary + "은 " + salary1 + tenThousand + " + " + bonus + salary1Bonus + tenThousand + "으로 총 " + (salary1 + salary1Bonus)+ tenThousand + lastMent);
        System.out.println("김" + position2 + "의 " + salary + "은 " + salary2 + tenThousand + " + " + bonus + salary2Bonus + tenThousand + "으로 총 " + (salary2 + salary2Bonus)+ tenThousand + lastMent);
        System.out.println("김" + position3 + "의 " + salary + "은 " + salary3 + tenThousand + " + " + bonus + salary3Bonus + tenThousand + "으로 총 " + (salary3 + salary3Bonus)+ tenThousand + lastMent);
        System.out.println("김" + position4 + "의 " + salary + "은 " + salary4 + tenThousand + " + " + bonus + salary4Bonus + tenThousand + "으로 총 " + (salary4 + salary4Bonus)+ tenThousand + lastMent);







    }
}
