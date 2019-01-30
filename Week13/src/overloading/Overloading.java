package overloading;

public class Overloading {

	public Overloading() {
		// TODO Auto-generated constructor stub
	}

	public static void square(int num) {
		System.out.println("In here with an int");
		System.out.println(num * num);
	}

	public static void square(double num) {
		System.out.println("In here with a double");
		System.out.println(num * num);
	}

	public void addTwoNumbers(int num1, int num2) {
		int answer = num1 + num2;
		System.out.println(answer);
	}

	public void addThreeNumbers(int num1, int num2, int num3) {
		int answer = num1 + num2 + num3;
		System.out.println(answer);
	}

	public static void main(String[] args) {
		square(34);
		square(3.4);

	}
	
	public void addNumbers(int num1, int num2) {
		int answer = num1+num2;
		System.out.println(answer);
	}
	
	public void addNumbers(int num1, int num2, int num3) {
		int answer = num1 + num2 + num3;
		System.out.println(answer);
	}

}
