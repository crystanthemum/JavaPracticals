package nestForLoops;
/*
 * 
 */
public class BreaksAndContinue {
	/*
	 * 
	 */
	public static void main(String[] args) {
		for (int loop=10; loop>=0;loop--)
		{
			if (loop==3) 
			{
				System.out.println("abort!");
				break; //completely stops once it reaches 3
			}
			if (loop ==6) 
			{
				System.out.println("miss a few");
				loop+=3; //compound assignment operator loop=loop+3
			}
			if (loop==7)
			{
				System.out.println("skipped 7");
				continue; //pauses and go back to the top of the loop
			}
			
			System.out.println(loop);
		}
		
		System.out.println("end");
	}

}
