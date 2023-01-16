package String;

public class Ex01 {

    public static void main(String[] args) {

        // String은 클래스이다.
        // 문자열은 굉장히 많이 쓰이므로 자바에서는
        // String 클래스를 기본형과 같은 형식으로 쓸 수 있도록 해두었다.

        String str1 = "Hello";
        String str2 = "Hi";
        String str3 = "Hello";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println();

        String str4 = new String("java");
        String str5 = new String("java");

        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));
    }

}
