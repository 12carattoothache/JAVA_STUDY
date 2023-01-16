package inheritance;

class Sedan {
    String color;

    public Sedan() {
        System.out.println("Sedan 클래스 기본생성자");
    }

    public Sedan(String str) {
        System.out.println("Sedan 클래스 생성자 : " + str);
    }
}

class Sonata extends Sedan {

    public Sonata(String str) {
        super(str);
        System.out.println("Sonata 클래스 생성자 : " + str);
    }

    public void setColor(String color) {
        super.color = color;
    }

    public void colorPrint() {
        System.out.println("소나타 색상은  : " + this.color);
    }
}

public class Ex02 {

    public static void main(String[] args) {
        Sonata sonata = new Sonata("소나타 객체 생성");

        sonata.setColor("검정");

        sonata.colorPrint();
    }

}
