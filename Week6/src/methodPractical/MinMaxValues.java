package methodPractical;

public class MinMaxValues {

	public static void main(String[] args) {
		min(88,88);
		max(44,2);
	}
	public static void min (int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		}
		else if (num2 < num1) {
			System.out.println(num2 + " is smaller than " + num1);
		}
		else {System.out.println("both numbers are the same");
		
		}
	}
	public static void max (int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		}
		else if (num2 > num1){
			System.out.println(num2 + " is bigger than " + num1);
		}
		else {System.out.println("both numbers are the same");
		
		}
	}
	public static void avg (int num1, int num2, int num3, int num4) {
	}
}
