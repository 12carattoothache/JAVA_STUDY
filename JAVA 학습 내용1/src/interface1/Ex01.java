package interface1;

interface Animal {
    public static final int MAX_AGE = 500;

    public abstract void sound();

    // 1. 모든 멤버변수는 public static final이어야 하며, 이를 생략할 수 있음.
    // 2. 모든 메소드는 public abstract이어야 하며, 이를 생략할 수 있음.
    // 3. 단, static 메소드와 default 메소드는 예외로 함

    public default void defaultMethod() {
        System.out.println("디폴트 메소드");
    }

    public static void staticMethod() {
        System.out.println("static 메소드");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("멍멍멍");    }
}

public class Ex01 {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.sound();

        Dog myDog = new Dog();
        myDog.sound();

        Animal myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Dog();
        myAnimal.sound();

        System.out.println();

        Animal[] myAnimals = new Animal[2];
        myAnimals[0] = new Cat();
        myAnimals[1] = new Dog();

        myAnimals[0].sound();
        myAnimals[1].sound();
    }
}
