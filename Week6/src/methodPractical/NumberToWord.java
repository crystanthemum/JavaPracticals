package methodPractical;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {

		printNumberInWord();
	}
	public static void printNumberInWord () {
		Scanner scanner = new Scanner(System.in);
		int userInput;
		System.out.println("Please enter a number from 1 - 7 ");
		userInput = scanner.nextInt();
		
		switch (userInput) 
		
		{
			case 1 : System.out.println("one");	
				break;
			case 2 : System.out.println("two");
				break;
			case 3 : System.out.println("three");
				break;
			case 4 : System.out.println("four");
				break;
			case 5 : System.out.println("five");
				break;
			case 6 : System.out.println("six");
				break;
			case 7 : System.out.println("seven");
				break;
			default : System.out.println("Enter a valid number");
			
			}
			
			scanner.close();
		}
	}
