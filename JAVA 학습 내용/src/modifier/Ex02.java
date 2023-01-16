package modifier;

class Box {
	
	static int boxID = 0; // 메모리의 최상단에 올라가 있는 변수
	// 객체마다 가지고 있지 x
	int idNum = 0; // 객체마다 가지고 있는 변수
	
	public void increase() {
		boxID++;
		idNum++;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("boxID : " + box1.boxID);
		System.out.println("idNum : " + box1.idNum);
		System.out.println();
		
		box2.increase();
		System.out.println("boxID : " + box2.boxID);
		System.out.println("idNum : " + box2.idNum);
		System.out.println();
		
		box3.increase();
		System.out.println("boxID : " + box3.boxID);
		System.out.println("idNum : " + box3.idNum);
		System.out.println();
		
		// 인스턴스 변수는 객체마다 공유되지 않는다.
		// static 변수는 모든 객체가 공유된다.
		
		System.out.println("boxID : " + Box.boxID);
		// 정적필드는 원칙적으로 클래스명으로 접근
		// 객체를 생성하지 않아도 사용할 수 있음
		
	}

}
