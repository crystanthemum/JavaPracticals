package overloading;

public class MultiplicationMachine {

	public MultiplicationMachine() {
		// TODO Auto-generated constructor stub
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double multiply(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	public static double multiply(double num1, double num2, double num3, double num4) {
		return num1 * num2 * num3 * num4;
	}
	
	public static void main(String[] args) {
		System.out.println();
	}

}
