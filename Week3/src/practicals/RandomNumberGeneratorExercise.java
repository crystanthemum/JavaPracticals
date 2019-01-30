package practicals;
/*
 Importing a different type of class other than scanner
 */
import java.util.Random;

public class RandomNumberGeneratorExercise {
	/*
	 * 
	 */
	public static void main(String[] args) {
		//declare variable
		int randomInt;
		
		System.out.println("generating 5 random integers in range 0-99.");
		
		Random randomGenerator = new Random();
		for (int loop = 1; loop <= 5; loop++) {
			randomInt = randomGenerator.nextInt(100);
			System.out.println("generated :" + randomInt);
		}
		System.out.println("done");
	}

}
