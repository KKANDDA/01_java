package main.java.com.ohgiraffers.section02.encepsulation.problem3;

public class Monster {
    String kind;
    int hp;

    public void setInfo(String info){
        this.kind=info;
    }
    public void setHp(int hp/*매개변수*/){
        if(hp>0){
            System.out.println("정상적으로 체역이 입력되었습니다.");
            this.hp = hp;

        }else{
            System.out.println("체력은 0보다 작거나 같을 수 없습니다.");
            this.hp = 0;
        }
    }
    public String getIfo(){
        return "몬스터는 " + kind + " 이고, 체력은 " + hp + "입니다.";
    }

}
