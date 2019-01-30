package practical4;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int input;
		
		do {
			System.out.println("1.File\n\n2.Edit\n\n3.Save\n\n4.Delete\n\n5.Exit\n\n\tSelect Option...");
			input = scanner.nextInt();
			switch (input) {
			case 1 : System.out.println("File selected");
				break;
			case 2 : System.out.println("Edit selected");
				break;
			case 3 : System.out.println("Save selected");
				break;
			case 4 : System.out.println("Delete selected");
				break;
			case 5 : System.out.println("Exit selected");
				break;
			default : System.out.println("invalid input, please select from menu");
			}
		}
		while (input != 5);
		
		scanner.close();
		
		
			
			
			
		
		
		
		
	}

}
