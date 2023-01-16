package classs.field;

class Car {
	
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 300;
	int speed; // default : 0
}

public class Ex02 {

	public static void main(String[] args) {
		
		// Car 클래스에 대한 객체 생성하기
		Car myCar = new Car(); 
		
		// 생성된 객체를 사용해서 필드 출력하기
		System.out.printf("제작 회사 : %s\n", myCar.company);
		System.out.printf("모델명 : %s\n", myCar.model);
		System.out.printf("색상 : %s\n", myCar.color);
		System.out.printf("최고속도 : %s\n", myCar.maxSpeed);
		System.out.printf("현재 속도 : %s\n", myCar.speed);
	}

}
