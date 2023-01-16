package random;

public class Ex02 {

	public static void main(String[] args) {
		// 정수 1 ~ 45까지의 수 중에 6개 뽑기(중복되는 번호 없이)
		
		int lotto[] = new int[6];
		
		// 반복문을 통해 1 ~ 45까지의 정수를 뽑아 배열의 각 요소에 저장하기
		
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
			
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%d번째 수는 : %d\n", (i+1), lotto[i]);
		}

	}

}
