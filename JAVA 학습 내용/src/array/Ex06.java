package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] array = {40, 20, 30, 40, 50};
		
		// 값을 입력받아 해당하는 인덱스 출력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("array 배열의 값은 10, 20, 30, 40, 50입니다.");
		System.out.println("값을 입력 : ");
		int value = scan.nextInt();
		
		int x = 0;
		
		while(x < array.length) {
			
			if(array[x] == value) {
				System.out.printf("%d의 인덱스는 %d\n", value, x);
			}
				x++;
		}
	}

}
