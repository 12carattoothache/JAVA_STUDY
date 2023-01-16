package classs.constructor;

class Car1 {
	
	// 필드
	String company = "현대자동차";
	String model;
	
	// 생성자
	// 1. 기본생성자를 명시하지 않으면 자바 컴파일러는 기본 생성자를 만들어 준다.
	// 2. 그러나 생성자를 명시해주면 만들지 않는다.
	// 3. 반환타입이 없다.
	// 4. 생성자는 클래스 이름과 같은 이름을 써야한다.
	public Car1() { // 기본생성자
		System.out.println("Car1 생성자를 호출했습니다.");
		System.out.println("생성자는 객체 생성시 호출되어 초기화 역할!");
	}
	
	public Car1(String model) {
		this.model = model;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1("소나타"); // 객체 생성
   // 클래스타입 참조변수  연산자 생성자호출 
		// 객체를 생성하면 생성자가 호출이 되고
		// 필드 초기화와 메소드 호출 등 객체를 사용할 준비를 한다.
		
	    Car1 myCar2 = new Car1("그랜져");
	    
	    System.out.println("제작회사 : " + myCar1.company);
	    System.out.println("제작회사 : " + myCar2.company);
	    
	    System.out.println("모델 : " + myCar1.model);
	    System.out.println("모델 : " + myCar2.model);
	   
	}
	

}
