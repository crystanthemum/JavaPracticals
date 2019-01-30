package practicals;

import java.util.Scanner;

public class Practical3Part1 {

	public static void main(String[] args) {
		//1. declare variable
		double userInput = 0;
		//2. set up the scanner
		Scanner scanner = new Scanner(System.in);
		//3. prompt the user for an input
		System.out.println("Please enter a decimal point number in the format xx.xxx eg 12.3456");
		//4. scanners scans users input
		userInput = scanner.nextDouble();
		
		System.out.printf("Number rounded (two decimal places): %.2f %n\n", userInput);
		System.out.printf("Number squared (three decimal places): %.3f\n ", Math.pow(userInput,userInput));
		System.out.printf("Number cubed to (three decimal places) : %.3f\n", Math.pow(userInput, 3));
		System.out.printf("Square root (four decimal places) : %.4f\n", Math.sqrt(userInput));
		
		scanner.close();
		
	}

}
