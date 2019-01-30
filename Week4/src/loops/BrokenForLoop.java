package loops;

public class BrokenForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1; //taken out so int can be used again,increased scope
		for (;count <11; count++) {
			System.out.println(count);
			
		int count1 =1;
		for (;count1<11;)
			System.out.println(count1++);
		}

	}

}
