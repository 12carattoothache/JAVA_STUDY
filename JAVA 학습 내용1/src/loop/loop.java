package loop;

public class loop {

	public static void main(String[] args) {
		for (int i = 0; i <= 90; i += 10) {
			if (i != 90) {
				System.out.printf("%d, ", i);
			}
			else {
				System.out.printf("%d", i);
			}
		}
	}
}
