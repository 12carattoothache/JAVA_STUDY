package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 배열과 for문을 사용하여 3명의 이름을 받고 출력해보자
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		
		// 입력받기
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%d번째 학생의 이름은? : ", (i+1));
			name[i] = scan.next();
		}
		
		// 출력하기
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%d번째 학생의 이름 : %s\n", (i+1), name[i]);
		}
	}

}
