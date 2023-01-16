package modifier;

class Person {
	
	static final String NATION = "KOREA";
	// 정적 불변의 상수(메모리의 최상단에 올라가므로 반드시 선언과 동시에 초기화!)
	// 역할 : 공용데이터
	
	final String SSN;
	// 불변의 인스턴스 상수
	// 선언과 동시에 초기화를 하거나, 혹은 생성자에서 단 한번만 초기화가 이루어진다.
	
	String name;
	int age;
	// 인스턴스 변수
	
	public Person(String ssn, String name, int age) {
		this.SSN = ssn;
		this.name = name;
		this.age = age;
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		Person person = new Person("1234567-1234567", "홍길동", 20);
		
		System.out.println("국가 : " + Person.NATION);
		System.out.println("주민번호 : " + person.SSN);
		System.out.println("이름 : " + person.name);
		System.out.println("나이 : " + person.age);
		System.out.println();
		
		// Person.NATION = "USA";
		// person.SSN = "1111111-2222222";
		// final 상수는 한 번만 초기화 가능하고 수정이 안됨.
		
		person.name = "홍길순";
		person.age = person.age + 1;
		
		System.out.println("국가 : " + Person.NATION);
		System.out.println("주민번호 : " + person.SSN);
		System.out.println("이름 : " + person.name);
		System.out.println("나이 : " + person.age);
		System.out.println();
		
		// 결론
		// 1. static final : 정적불변의 상수
		// 메모리 최상단에 하나만 생성이 되고 공유되는 상수이다.
		
		// 2. final : 불변의 인스턴스 상수. 메모리의 힙에 할당이 된다.
		// new 연산자를 통해 만들어진 인스턴스(객체)의 개수만큼 생성된다.
		
		// 보통 프로그래밍에서 상수라는 용어는 static final이다.
		

	}

}
