package practicals;

import java.util.Scanner;

public class VotingExercise {

	public static void main(String[] args) {
		//1. declare variables
		int age = 0;
		//2. set up the scanner
		Scanner scanner = new Scanner(System.in);
		//3. get the input from user
		System.out.println("what is your age");
		//4. scanners scan what the input is
		age = scanner.nextInt();
		
		if (age >= 18) {System.out.println("you are old enough to vote");
		
		} else {System.out.println("you are too young to vote");
		}
		
		//5. close the scanner
		scanner.close();
		
		
		
	}

}
