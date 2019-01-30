package exercise1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		int randomNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		randomNumber = rand.nextInt(10)+ 1;
		
		System.out.println("guess a number between 1 - 10");
		
		while (randomNumber != scanner.nextInt()) {
			System.out.println("guess again");
		}
		
		System.out.println("yay");
		
		scanner.close();

	}

}
