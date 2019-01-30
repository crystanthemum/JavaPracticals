package practicalREVISION;

import java.util.Scanner;

public class Part_1 {

	public static void main(String[] args) {
		Double userInput = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a decimal point"+
		"number in  the format xx.xxx eg 12.3456");
		
		userInput = scanner.nextDouble();
		System.out.printf("Number rounded (two decimal places)\t:%.2f \n",userInput);
		System.out.printf("Number squared (three decimal places)\t:%.3f\n",Math.pow(userInput, 2));
		System.out.printf("Number cube to (three decimal places)\t:%.3f"
				+ "\n",Math.pow(userInput, 3));
		System.out.printf("Square root (four decimal places)\t:%.4f \n",+Math.sqrt(userInput));
		
		scanner.close();
		
	}

}
