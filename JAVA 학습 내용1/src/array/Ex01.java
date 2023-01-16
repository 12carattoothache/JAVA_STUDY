package array;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray1 = {10, 20, 30};
		// 실제값을 알고 있을 때
		// 선언과 동시에 배열을 생성하면 new 연산자 생략가능
		
		System.out.println(intArray1);
		// 주소값
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		// 배열사용은 []안에 인덱스를 이용해서 사용한다.
		
		int[] intArray2 = null; // 실제값과 길이를 나중에 넣을 때
		intArray2 = new int[] {1,2,3}; // new 연산자를 써준다
		
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		
		int[] intArray3 = new int[3]; // 배열의 길이만 지정할 때
		
		intArray3[0] = 4;
		intArray3[1] = 5;
		intArray3[2] = 6;
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
	}

}
