package classs.field;

class Car2 {
	
	String color;
	int speed;
	
	// 필드를 메소드로 접근할 수 있다.
	public void upSpeed(int value) {
		speed += value;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 myCar1 = new Car2();
		myCar1.color = "빨강"; // 객체이름.필드
		myCar1.speed = 100;
		
		Car2 myCar2 = new Car2(); // 객체는 여러 개 생성할 수 있다.
		myCar2.color = "파랑";
		myCar2.speed = 120;
		
		myCar1.upSpeed(50); // 객체이름. 메소드명(매개값);
		System.out.println("자동차1의 색상은 : " + myCar1.color);
		System.out.println("자동차1의 색상은 : " + myCar1.speed);
		System.out.println();
		
		myCar2.upSpeed(50); // 객체이름. 메소드명(매개값);
		System.out.println("자동차2의 색상은 : " + myCar2.color);
		System.out.println("자동차2의 색상은 : " + myCar2.speed);
		
	}

}
