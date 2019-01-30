package methodsPractical;

public class Multiples {

	public static void main(String[] args) {
		isMultiple(4, 2);
	}
	public static void isMultiple(int num1, int num2) {
		if (num1%num2 ==0) {
			System.out.println(num1 +" and " + num2 + " is a multiple");}
			else if (num1%num2!=0) {
				System.out.println(num1 +" and " + num2 + " is not a multiple");
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}


