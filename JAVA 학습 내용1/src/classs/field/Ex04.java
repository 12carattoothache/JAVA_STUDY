package classs.field;

class Car3 {
	String color;
	int speed;
	
	public void setSpeed(int speed) { // set : 저장하다
		this.speed = speed;
		// 매개변수와 필드의 이름이 동일하기 때문에
		// this라는 참조변수로 필드를 사용할 수 있다.
	}
	
	public int getSpeed() { // get : 가져오다
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
		// 필드로 바로 접근
		myCar.color = "빨강";
		myCar.speed = 100;
		System.out.println("내 자동차 색상 : " + myCar.color);
		System.out.println("내 자동차 속도 : " + myCar.color);
		System.out.println();
		
		// 메소드를 통해 필드로 접근(이 방법을 주로 사용)
		myCar.setColor("파랑");
		myCar.setSpeed(120);
		System.out.println("내 자동차 색상 : " + myCar.getColor());
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());
		
	}

}
