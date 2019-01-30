package revisionOrganiser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class RevisionOrganiser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int userInput; 
		System.out.print("what are you studying today.\n1. Programming\n2. Software Testing\n3. Databases.\n");
			
		userInput = scanner.nextInt();
		switch (userInput) {
			case 1 : programmingMenu();
				break;
			case 2 : System.out.println("Software testing");
				break;
			case 3 : System.out.println("Databases");	
				break;
			default : System.out.println("You cant revise that");
		}	
	}
	
	// programming menu
	public static void programmingMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pick a topic\n1 methods...");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: System.out.println("Here's something about methods!");
		break;
		}
	
	}
	
	// Software testing menu
	
	// Databases menu
}	
			
		
	

			
			


