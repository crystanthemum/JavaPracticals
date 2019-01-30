package practicals;

import java.util.Scanner;

public class Practical3Part2 {

	public static void main(String[] args) {
		int finalMark = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your final mark?");
		finalMark = scanner.nextInt();
		
		// input validation
		/*if (finalMark >100 || finalMark <0) {
			System.out.println("invalid entry");
			return; //return = you are finishing this method
		}*/
		
		while(finalMark >100 || finalMark <0)
		{
			System.out.println("Invalid input, try again:");
			finalMark = scanner.nextInt();
		}
		
		if (finalMark >= 70) {
			System.out.println("you got a Distinction");
		} 
		else if (finalMark >=60) {
			System.out.println("you got a Merit");
		}
		else if (finalMark >=50) {
			System.out.println("you passed");
		}
		else {
			System.out.println("failed");
		}
		scanner.close();
	} 	

}
