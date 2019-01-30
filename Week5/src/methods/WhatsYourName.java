package methods;
import java.util.Scanner;
public class WhatsYourName {

	public static void main(String[] args) {
		
		System.out.println("Hello "+getUsername());
		
	} //this method asks the users for their name and prints it out in the main method
	
	public static String getUsername() { //method name: helloName()
		Scanner scanner = new Scanner (System.in);
		String username = null; //local var = one sitting in a method. default value = NULL
		System.out.println("Enter your name");
		
		username = scanner.nextLine();
		
		while (username.equals("")) { //method signature is the method name and its parameters
			System.out.println("Please type in something");
			username = scanner.nextLine();
		}
		scanner.close();
		return username;
		
	}
}
