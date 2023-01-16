package String;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        // 자바에서 문자열을 기본타입으로 변환하는 방법

        String str = "100";

        System.out.println(Byte.parseByte(str));
        System.out.println(Short.parseShort(str));
        System.out.println(Integer.parseInt(str));
        System.out.println(Long.parseLong(str));

        str = "3.14";
        System.out.println(Float.parseFloat(str));
        System.out.println(Double.parseDouble(str));

        str = "true";
        System.out.println(Boolean.parseBoolean(str));

        // Scanner로 나이 입력(next()) String 변수에 저장 후
        // Wrapper 클래스로 문자열을 숫자로 변환 후 +1해서 출력하기

        Scanner scan = new Scanner(System.in);

        System.out.println("당신의 나이를 입력 : ");
        String strAge = scan.next();
        int age = Integer.parseInt(strAge);
        System.out.println("올해의 나이는 : " + (age+1));

    }
}
