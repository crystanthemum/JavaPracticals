package loops;

public class WhileLoop {

	public static void main(String[] args) {
		//if coding seems v repetitive, a loop would help 
		
		// 1. create a count counter
		int counter = 0; //initial value is 0
		
		while (counter < 11) {
			//loop body, anything in the {} will be repeated
			System.out.println("Counter " +counter);
			
			//counter needs to be incremented or else, infinite loop
			counter++; //++increment operator = counter+1
		} //end of while loop
			System.out.println("Done");
			//if the condition in the () is wrong, the code will not execute
			//NOTE: i can screenshot this and print it out and annotate it for notes
	}

}
