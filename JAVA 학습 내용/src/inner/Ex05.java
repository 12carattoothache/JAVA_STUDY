package inner;

class Outer5 {

    public void aaa() {
        System.out.println("aaa");
    }

    public void bbb() {
        System.out.println("bbb");
    }

    public void ccc() {
        System.out.println("ccc");
    }
}

public class Ex05 {

    public static void main(String[] args) {

        Outer5 anonymity = new Outer5() {
            public void bbb() {
                System.out.println("bbbbb");
            }

        }; // 세미콜론을 붙여준다.

        anonymity.aaa();
        anonymity.bbb();
        anonymity.ccc();

    }
}
