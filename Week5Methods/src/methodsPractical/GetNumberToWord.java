package methodsPractical;

import java.util.Scanner;

public class GetNumberToWord {

	public static void main(String[] args) {
		printNumberInWord(int 5);
	}

	/**
	 * method will print out integer into word counterpart
	 */
	public static int printNumberInWord(int userNumber) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		int x = scanner.nextInt();

		switch (userNumber) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Please enter a valid number");
			scanner.close();
		}
		return userNumber;
	}

}
