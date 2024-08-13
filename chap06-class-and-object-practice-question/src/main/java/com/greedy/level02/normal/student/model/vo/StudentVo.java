package main.java.com.greedy.level02.normal.student.model.vo;

public class StudentVo {

    // 필드
    private int grade;
    private int classroom;
    private String name;
    private double hight;
    private char gender;

    // 기본 생성자
    public StudentVo(){}

    // 모든 필드를 초기화하는 생성자
    public StudentVo(int grade, int classroom, String name, double hight, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.hight = hight;
        this.gender = gender;
    }

    // setter & getter
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // + printInformation():void
    public void printInformation(){
        System.out.println("학년 : " + grade );
        System.out.println("반 : " + classroom );
        System.out.println("이름 : " + name);
        System.out.println("키 : " + hight);
        System.out.println("성별 : " + gender);
    }

    /*학년 : 1
    반 :　２
    이름 : 홍길동
    키 : 175.5
    성별 : 남*/

}
