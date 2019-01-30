package methodsPractical;

import java.util.Scanner; 

public class NumberToWord {

	public static void main(String[] args) {
		printNumberInWord();
	}
	
	public static void printNumberInWord() {
		int userInput = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1-9");
		userInput = scanner.nextInt();
			
		if (userInput == 1) {
			System.out.println("ONE");
		} else if(userInput==2) {
			System.out.println("TWO");
		} else {
			System.out.println("Invalid input");
					
		}
		
		switch(userInput) {
		case 1: System.out.println("ONE");
		break;
		case 2: System.out.println("TWO");
		break;
		case 3: System.out.println("THREE");
		break;
		case 4: System.out.println("FOUR");
		break;
		case 5: System.out.println("FIVE");
		break;
		case 6: System.err.println("SIX");
		break;
		}
		
		scanner.close();
		
		
		
	}

}
