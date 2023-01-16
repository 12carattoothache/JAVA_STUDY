package classs.constructor;


class Car2 {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	// 기본 생성자
	public Car2() {
		
	}
	
	// 생성자 오버로딩
	public Car2(String model) {
		// this.model = model;
		this(model, null, 0);
	}
	
	public Car2(String model, String color) {
		// this.model = model;
		// this.color = color;
		this(model, color, 0);
	}
	
	public Car2(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
			
	
}
public class Ex02 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2("그랜져", "검정", 200);
		// 객체 생성시 호출되어 객체 초기화 역할
		
		System.out.println("제작회사 : " +myCar.company);
		System.out.println("모델 : " +myCar.model);
		System.out.println("색상 : " +myCar.color);
		System.out.println("속도 : " +myCar.speed);
	}

}
