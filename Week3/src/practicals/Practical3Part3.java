package practicals;

import java.util.Scanner;

public class Practical3Part3 {

	public static void main(String[] args) {

		int usersAge = 0;
		String usersName = "";
		String usersVote = "";
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("what is your age?");
		usersAge = scanner.nextInt();
		
		if (usersAge >17) {
			System.out.println("what is your name?");
			usersName = scanner.next();
			System.out.printf("Name: %s, Age = %d\n", usersName,usersAge);
			
			System.out.println("which party are you voting for (con/lab)");
			usersVote = scanner.next();
			
			if (usersVote.equalsIgnoreCase("con")) {
				System.out.println("Voting registered for conservative");
			}
			else if (usersVote.equalsIgnoreCase("lab")) {
				System.out.println("Voting registered for labour");
			}
			else
			{
				System.out.println("sorry voting party unrecognised");
			}
		}
		else if (usersAge <0){
			System.out.println("sorry don't recognise your input");
		}
		else {
			System.out.println("too young to continue");
		}
		
		scanner.close();
		
	}
}
