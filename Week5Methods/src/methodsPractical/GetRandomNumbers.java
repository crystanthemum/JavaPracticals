package methodsPractical;

import java.util.Random;

public class GetRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRandomNumber();
	}
	/**
	 * method will return 10 random numbers
	 */
	public static int getRandomNumber() {
		
		Random random = new Random();
		System.out.println("Generating 10 random integers in range 1..100");
		for(int loop = 0; loop <=9; loop++) {
			System.out.println("Generated : "+ random.nextInt(100));
		}
		System.out.println("Done");
		return random.nextInt();
	}

}
