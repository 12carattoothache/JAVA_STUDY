package method;

public class Ex07 {
	public static void change1(int a) {
		a = 100;
	}
	
	public static void change2(int[] array) {
		array[0] = 100;
	}
	
	public static void main(String[] args) {
		int a = 1;
		change1(a); // 1의 값을 '복사'해서 넘겼으므로 원본 바뀌지 X.
		System.out.println(a);
		
		int[] array = {1,2,3,4,5};
		change2(array); // 배열의 주소를 넘겼으므로 원본 배열의 값도 바뀜.
		System.out.println(array[0]);
	}
}
