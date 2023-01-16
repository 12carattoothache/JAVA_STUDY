package method;

public class Ex06 {
	
	public static int sum1(int... n) { // 매개값의 개수를 모르는 경우
		int sum = 0;
		
		for (int i : n) {
			sum += i;
		}
		return sum;
	}
	
	public static int sum2(int[] array) { // 매개값을 배열로 받는 경우
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int a = sum1(1, 2, 3);
		System.out.println(a);
		
		
		int[] array = {1, 2, 3, 4, 5};
		
		int b = sum2(array);
		System.out.println(b);
	}

}
