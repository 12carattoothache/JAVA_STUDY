package modifier;

public class Ex01 {
	
	static int count1 = 0;
	// static : 메모리상의 정적이다.
	// 프로그램 시작 시 메모리의 메소드영역(최상단)에 할당된다.
	// 공유되는 전역 변수이다.
	
	int count2 = 0;
	// 인슽턴수 변수 (객체 생성 시 힙 메모리 영역에 할당된다.)
	// 각각의 객체가 가지고 있는 변수
	
	public void increase() {
		count1++;
		count2++;
		System.out.println("count1 : " + count1);
		System.out.println("count2 : " + count2);
	}

	public static void main(String[] args) {
		
		Ex01 ex1 = new Ex01(); // 객체 1
		ex1.increase();
		System.out.println();
		
		Ex01 ex2 = new Ex01(); // 객체 2
		ex2.increase();
		System.out.println();
		
		Ex01 ex3 = new Ex01(); // 객체 3
		ex3.increase();
		System.out.println();
	}

}
