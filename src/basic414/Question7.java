package basic414;

public class Question7 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 100; i <= 200; i++) {
			if (i % 7 == 0) {

				System.out.println(i);

				sum = sum + i;

			}

		}
		System.out.println("Sum = " + sum);

	}

}
