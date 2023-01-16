package classs.field;

class FieldEx {
	// 필드 field : class에 선언된 변수(멤버변수)
	// 필드와 메소드에 선언된 변수는 틀리다.
	// class에 선언된 변수 : 전역변수(field)
	// method에 선언된 변수 : 지역변수
	
	int x = 100;
	String str = "자바";
	
	public void method1() {
		String name = "홍길동";
		int age = 20;
		// 지역변수는 메모리의 스택(stack) 영역에 저장된다.
		// 스택영역은 메소드의 호출과 함께 할당되며, 호출이 완료되면 소멸한다.
	}
	
	public void method2() {
		// System.out.println(name);
		// System.out.println(age);
		// 지역변수는 해당 메소드에서만 사용이 가능하다.
		
		System.out.printf("전역변수 x : %d\n", x);
		System.out.printf("전역변수 str : %s", str);
		// 필드(전역변수)는 전체에서 사용이 가능하다.
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		FieldEx ex = new FieldEx(); // 객체생성
		
		// 객체사용 > 객체이름.필드
		System.out.println(ex.x);
		System.out.println(ex.str);
		System.out.println();
		
		// 객체사용 > 객체이름.메소드명();
		ex.method1();
		ex.method2();
		

	}

}
