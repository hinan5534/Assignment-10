package Assignment_10;

public class question20_fact {

	public static void main(String[] args) {


		int number = 5;
		int sum = 1;

		if (number < 0) {
			System.out.println("Invalid number!");
			return;
		}

		for (int i = 1; i <= number; i++) {
			sum *= i;
		}

		System.out.println(sum);


	}

}
