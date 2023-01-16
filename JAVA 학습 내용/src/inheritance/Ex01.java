package inheritance;

class Parent { // 부모 클래스

    int parentMoney = 1000;

    public void parentMethod() {
        System.out.println("부모클래스 메소드 입니다.");
    }

}

class Child extends Parent { // 자식클래스

    int childMoney = 500;

    public void childMethod() {
        System.out.println("자식클래스 메소드입니다.");
    }
    public Child() {
        super(); // 부모생성자가 먼저 호출된다.
        // 첫줄에만 올 수 있다.
        System.out.println("자식클래스 생성자입니다.");
    }

}

public class Ex01 {

    public static void main(String[] args) {

        Child child = new Child();

        System.out.println(child.parentMoney); // 부모필드
        System.out.println(child.childMoney); // 자식필드

        child.parentMethod(); // 부모 메소드 호출
        child.childMethod(); // 자식 메소드 호출출
    }
}

