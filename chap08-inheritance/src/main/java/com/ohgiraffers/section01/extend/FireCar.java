package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends/*뒤에 나오는 클래스로부터 상속을 받는다는 키워드*/ Car{
    public FireCar(){
        super(); // 부모에게 있는 것을 쓸 수 있게 해준다.
    }
    // 부모클래스가 자녀 클래스를 무조건 대신 할 수 있어야 한다. 반대는 안 된다.
    @Override
    public void soundHorn() {
            if(isRunning()){ // 이즈러닝도 부모가 가지고 있기에 쓸수 있는 것임
                System.out.println("빠아아아아아아ㅏ아아아아ㅏ아아아아ㅏ아앙");
            }else{
                System.out.println("소방차가 멈춰있습니다.");
            }
        }

        public void sprayWater(){
            System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
        }

    }

