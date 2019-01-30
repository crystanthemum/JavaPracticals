package practicalREVISION;

import java.util.Scanner;

public class Part_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("Enter mark...");
		
		userInput = scanner.nextInt();
		
		if (userInput <=49) {
			System.out.println("Classification : Fail");
		} else if (userInput == 50 || userInput <= 59) {
			System.out.println("Classification : Pass");
		} else if (userInput == 60 || userInput <= 69) {
			System.out.println("Classification : Merit");
		} else if (userInput == 70 || userInput <= 100) {
			System.out.println("Classification : Distinction");
		} else {
			System.out.println("Please enter a valid number");
		}
		scanner.close();
	}

}
