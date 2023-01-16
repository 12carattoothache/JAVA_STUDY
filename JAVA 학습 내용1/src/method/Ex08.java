package method;

import java.util.Scanner;

public class Ex08 {
	// 정수 배열을 매개값으로 받아서 그 배열 안을 1부터 차례대로 채워주는 메소드
	public static void arrayFill(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 길이를 입력 : ");
		int arrayLength = scan.nextInt();
		
		int[] array = new int[arrayLength];
		
		arrayFill(array);
		
		for (int i : array) {
			System.out.printf("%d번째 수 : %d\n", (i-1), i);
		}
		

	}

}
