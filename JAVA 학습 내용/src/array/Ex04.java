package array;

public class Ex04 {

	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 40, 50, 60};
		
		// for문을 사용해서 배열의 값을 출력하기
		for (int i = 0; i < intArray.length; i++) {
			
			if(i == 3) {
				continue;
			}
			
			System.out.printf("intArray[%d] : %d\n", i, intArray[i]);
		}

	}

}
