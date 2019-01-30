package loops;

public class GeneralLoops {

	public static void main(String[] args) {
		//while loop
		int loop = 20;
		
		while (loop>1) {
			System.out.println(loop);
			loop--;
		}
		
		//do while loop (runs at least once)
		int doWhileCounter = 2;
		do {
			System.out.println(doWhileCounter);
			doWhileCounter++;
		} while (doWhileCounter<10); 
		
		//infinite loop
		
		/* int loop2 = 10;
		do {
			System.out.println("count is " +loop2);
			loop2--;
		} while (loop2<11); */ //don't run this omg.
	}

}
