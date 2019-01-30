package nestForLoops;

public class NestedForLoops1 {

	public static void main(String[] args) 
	{
		
		//nested for loop
		//outer loop
		for (int outer=1;outer<=3; outer++) 
		{
			//inner loop goes inside the outer loop
			for (int inner = 1;inner<=5;inner++) 
			{
			System.out.println(outer + " " + inner);	
			} //end of inner
			
		} //end of outer
		
		System.out.println("bye");

	}

}
