package pack01;

// public 클래스는 다른 패키지에서도 접근 가능
public class A {

		public int x = 10;
		
		public A() {
			System.out.println("클래스 A의 생성자입니다.");
			System.out.println("다른 패키지에서도 접근이 가능합니다.");
		}

}

class B {
	
	public int x = 100;
	
	public B() {
		System.out.println("클래스 B의 생성자입니다.");
		System.out.println("같은 패키지에서만 접근이 가능합니다.");
	}
}
