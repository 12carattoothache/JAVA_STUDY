package wrapper;

public class Ex02 {
    public static void main(String[] args) {
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer(100);

        // 포장객체 비교
        System.out.println(obj1 == obj2);
        // equals 메소드는 내부의 데이터를 비교하여 같으면 true, 다르면 false를 반환

        System.out.println(obj1.equals(obj2));
    }

}
