package method;

public class Ex01 {
	
	public static void method1() {
		System.out.println("void 형의 메소드는 return 값이 없음");
	}
	
	public static int method2() {
		System.out.println("return 타입이 int 형인 메소드");
		int a = 100;
		return a;
	}

	public static void main(String[] args) {
		System.out.println("메인 메소드입니다.");
		
		method1();
		
		int b = method2();
		
		System.out.printf("method2의 return 값 : %d", b);

	}

}
