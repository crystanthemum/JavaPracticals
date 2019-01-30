package loops;
/*
 * 
 */
public class ForLoops {
	/*
	 * 
	 */
	public static void main(String[] args) {
			//(initial state, terminating, increment/decrement)
		for (int count=1;count<11;count++) {
			System.out.println(count); //the dot = breakpoint
			
		//Write a for loop for a number starting from 100 - 0
			
		//method 1.
		//-=2 means take it down by 2
		for (int number =100;number>=0 ; number-=2) {
			System.out.println(number);
			
		}
		//method 2.
		for (int number1 =100;number1 >=0; number1--) {
			if (count % 2 == 0) {
				System.out.println(number1);
			}
				
		}
		}
	}

}
