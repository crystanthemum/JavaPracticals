package methods;

public class OddEven {

	public static void main(String[] args) {
		
		checkOdd(75456);
	}
	public static int checkOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		return number;
	} 
	
	}
	
