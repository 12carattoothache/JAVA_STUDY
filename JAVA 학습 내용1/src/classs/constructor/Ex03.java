package classs.constructor;

// Car3 클래스를 만든다.
// 필드는 String color; int speed; 로 하고 외부에서의 접근을 금지한다.
// 생성자에서 매개값을 받아 필드를 초기화하자.
// 속도가 0 미만이거나 200을 초과할 경우 속도를 50으로 세팅한다.
// getter 메소드를 만들어서 필드를 사용할 수 있게 한다.

class Car3 {
	private String color;
	private int speed;
	
	public Car3(String color, int speed) {
		this.color = color;
		
		if (speed < 0 || speed > 200) {
			System.out.println("속도는 0부터 200 사이입니다.");
			System.out.println("속도를 50으로 초기화합니다.");
			this.speed = 50;
		}
		else {
			this.speed = speed;
		}
		
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Car3 myCar = new Car3("빨강", 250);
		
		System.out.println("내 자동차 속도 : " + myCar.getColor());
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());
	
	}

}
