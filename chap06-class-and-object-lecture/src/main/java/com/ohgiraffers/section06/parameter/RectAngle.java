package main.java.com.ohgiraffers.section06.parameter;

public class RectAngle {

    private  double weight;

    private  double height;

    public RectAngle() {
    }

    public RectAngle(double weight, double rectAngle) {
        this.weight = weight;
        height = rectAngle;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = weight * height;
        System.out.println("사각형의 넓이는 : " + area);
    }
    public void calcRound(){
        double round = (weight + height)*2;
        System.out.println("사각형의 둘레는 : " + round);
    }

    @Override
    public String toString() {
        return "RectAngle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
