package inheritance;


/*final*/ class Suv {
    private String color;
    int speed = 100;

    public void run() {
        System.out.println("SUV 차량이 달립니다.");
    }
}

class Santafe extends Suv {
    int speed = 120;

    @Override
    public void run() { // 메소드 overWriting(재정의 메소드)
        System.out.println("싼타페 차량이 달립니다.");
    }

    public void disp() {
        super.run(); // 부모메소드 호출
        System.out.println("SUV 속도 : " + super.speed); // 부모 필드

        this.run(); // 자식메소드 호출
        System.out.println("싼타페 속도 : " + this.speed); // 자식 필드

    }

}

public class Ex03 {

    public static void main(String[] args) {
        Santafe santafe = new Santafe();

        santafe.disp();
    }
}
