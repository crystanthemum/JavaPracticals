package methodPractical;
import java.util.Scanner;
/*
 * 
 */
public class PrintNameXTimes {
	/*
	 * 
	 */
	public static void main(String[] args) {
		printMyName();
	}
	/*this method will print my name various no. of times 
	 * depending on the parameter set
	 */
	public static void printMyName() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("What's your name?");
		String userName = scanner.next();
		System.out.println("How many times do you want your name printed out?");
		int xTimes = scanner.nextInt();
		for (int loop = 0; loop<xTimes; loop++) {
			System.out.println(userName);
		}
		scanner.close();
	}
	
	
}
