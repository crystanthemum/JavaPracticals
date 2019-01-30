package practicalREVISION;

import java.util.Scanner;

public class Part_3_Exercise_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Voting...\nEnter 'con' for Conservative and 'lab' for Labour");
		String userInput = scanner.next();
		
		if (userInput.equalsIgnoreCase("con")) {
			System.out.println("Voting registered for Conservative");
		} else if (userInput.equalsIgnoreCase("lab")) {
			System.out.println("Voting registered for Labour");
		} else {
			System.out.println("Sorry voting party unrecognised please try again");
		}
		userInput = scanner.next();
		scanner.close();
		
		
	}

}
