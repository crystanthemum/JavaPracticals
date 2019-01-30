package methodsPractical;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		getOddOrEven();

	}

	public static void getOddOrEven() {
		int userInput = 0;
		Scanner scanner = new Scanner(System.in);
		
		userInput = scanner.nextInt();
		if (userInput % 2 == 0) {
			System.out.println("even");
		} else if (userInput % 2 == 1) {
			System.out.println("odd");
		} else
			System.out.println("Invalid input try again");
		scanner.close();
	}
		

}
