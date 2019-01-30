package loops;

public class WhileLoop2 {

	public static void main(String[] args) {
		int countDown = 10;
		while(countDown!=0) {
			System.out.println(countDown);
			countDown--; //-- is the decrement operator = -1
		}
		System.out.println("blast off");
	}

}
