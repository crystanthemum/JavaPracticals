package practicalREVISION;

import java.util.Scanner;

public class Part_3_Exercise_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userAge = 0;
		
		System.out.println("How old are you");
		
		userAge = scanner.nextInt();
		
		if (userAge >= 17 && userAge < 100) {
			System.out.println("What is your name?");
		} else if (userAge < 17){
			System.out.println("Too young to continue");
		} else {
			System.out.println("Sorry don't recognise your input");
		}
		String userName = scanner.next();
		System.out.println("Hello " + userName + " you are "+ userAge);
		
		scanner.close();
		
	}

}
