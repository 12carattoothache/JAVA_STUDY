package classs.field;

class Car5 {
	
	private int speed; // 필드에 바로 접근하는 것을 막음
	private String color;
	// private : 데이터 보호를 위해 외부 접근을 금지함
	
	public int getSpeed() {
		
		if (0 < this.speed && this.speed< 50) {
			this.speed = 50;
		}	
		return speed;
	}
	
	public void setSpeed(int speed) {
		
		if(speed < 0 || speed > 200) {
			return; // void형 메소드의 return : 메소드 실행을 강제 중지
		}
		else {
			this.speed = speed;
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}


public class Ex05 {
	
	public static void main(String[] args) {
		Car5 myCar = new Car5();
		
		// myCar.speed = -100; 
		// 필드에 바로 접근 : 객체의 무결성이 깨짐
		// 자동차의 속도는 음수가 될 수 없으므로
		
		myCar.setSpeed(30);
		myCar.setColor("빨강");
		
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());
		System.out.println("내 자동차 색상 : " + myCar.getColor());
	}

}
