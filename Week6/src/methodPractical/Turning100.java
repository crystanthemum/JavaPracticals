package methodPractical;
import java.util.Scanner;
/*
 * 
 */
public class Turning100 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		whenWillIBe100();
		
	}
	public static void whenWillIBe100() {
		int currentAge;
		Scanner scanner = new Scanner (System.in);
		System.out.println("How old are you?");
		currentAge = scanner.nextInt();
		int year100 = 0;
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		year100 = 100 - currentAge + year;
			if (currentAge <0) {
				System.out.println("Please enter a valid age");
			} else if (currentAge >100) {
				System.out.println("Wow you are very old");
			} else if (currentAge <10) {
				System.out.println("Wow you are very young");
			} else {System.out.println("You will be 100 in " + year100);}
			
			
		scanner.close();
		
	}
}
