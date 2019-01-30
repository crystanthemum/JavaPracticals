package loops;
import java.util.Scanner;
/*
 * 
 */
public class DoWhileLoopMenuDemo {
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userOption;
		
		//START OF LOOP
		do {
		//1. draw menu
		System.out.println("1. File");
		System.out.println("2. Edit");
		System.out.println("3. Print");
		System.out.println("4. Exit");
		
		//2. prompt menu
		System.out.println("Enter option...");
		
		//3. read in user option
		userOption = scanner.nextInt();
		
		//4. process option
		
			if (userOption==1) {
				System.out.println("File okay...");
			} else if (userOption ==2) {
				System.out.println("Edit okay");
			} else if (userOption==3){
				System.out.println("Exit okay");
			} else {
				System.out.println("Invalid input");
			}
		} while(userOption!=3);
		//END OF LOOP
		//5. exit
		System.out.println("done"); 
		
		switch (userOption) {
		case 1 : System.out.println("File");
			break;
		case 2 : System.out.println("Edit");
			break;
		case 3 : System.out.println("Print");
			break;
		case 4 : System.out.println("Exit");
			break;
		default : System.out.println("Invalid");
		
		scanner.close();
		
		}
		
		
		}


		}

