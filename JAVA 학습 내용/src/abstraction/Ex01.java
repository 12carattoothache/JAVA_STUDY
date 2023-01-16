package abstraction;


abstract class Hybrid { // 추상클래스

    public int speed;
    public String color;

    public void upSpeed(int speed) {
        this.speed += speed;
    }

    abstract void run();
    // 추상 메소드, 실제구현은 자식클래스에서 한다.
    // 만약, 클래스 내부에 추상메소드가 하나라도 있으면 그 클래스는 추상클래스가 된다.
    // 추상클래스가 되면, 객체를 직접 생성하지 못한다.
    // 자식의 클래스로 객체를 만들거나 익명중첩클래스로 객체를 만들어야 한다.
}

class Niro extends Hybrid {
    // 자식클래스에서 부모의 추상메소드는 강제 오버라이딩!!
    @Override
    void run() {
        System.out.println(color + "색의 니로가 " + speed + "의 속도로 달린다.") ;
    }
}

class Ioniq extends Hybrid {

    @Override
    void run() {
        System.out.println(color + "색의 아이오닉이 " + speed + "의 속도로 달린다.");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        //Hybrid hybrid = new Hybrid();  추상클래스는 객체 생성 불가

        Hybrid myHybrid = new Niro();
        myHybrid.color = "빨강";
        myHybrid.upSpeed(150);
        myHybrid.run();
        System.out.println();

        myHybrid = new Ioniq();
        myHybrid.color = "파랑";
        myHybrid.upSpeed(200);
        myHybrid.run();
    }

}
