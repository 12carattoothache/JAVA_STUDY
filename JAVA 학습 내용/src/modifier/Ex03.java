package modifier;

public class Ex03 {
	int x = 100; // 인스턴스 멤버변수
	static int y = 200; // 정적 멤버변수
	
	// 정적 메소드
	public static void disp() {
		Ex03 ex = new Ex03();
		System.out.println(ex.x);
		// System.out.println(x);
		// 정적 메소드 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없음.
		System.out.println(y);
	}

	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		ex.disp();
		System.out.println();
		
		Ex03.disp();
		System.out.println();
		
		disp(); // 같은 클래스이므로 메소드 이름만으로 호출 가능
		System.out.println();
		// 정적 메소드는 원칙적으로 클래스 이름으로 접근
		// 객체로 접근 시 이클립스에서 경고 표시
	}
}
