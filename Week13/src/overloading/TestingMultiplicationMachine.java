package overloading;

public class TestingMultiplicationMachine {

	public TestingMultiplicationMachine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//okay
		System.out.println(MultiplicationMachine.multiply(3, 4));
		System.out.println(MultiplicationMachine.multiply(3.0, 4.0, 8.9));
		
		//better 
		
		//test data
		double num1, num2, num3;
		
		num1 = 3.0;
		num2 = 4.0;
		num3 = 8.9;
		
		
		//		System.out.println(MultiplicationMachine.multiply(3, 4));

		//test case 1 
		double result = MultiplicationMachine.multiply(num1, num2);
		if (result == 12.0) {
			System.out.println("Test case 1 : Passed");
		} else {
			System.out.println("Test case 1 : Failed");
		}
		
		//test case 2
		
		double result1 = MultiplicationMachine.multiply(num1, num2, num3);
		if(result1 == 106.80000000000001) {
			System.out.println("Test case 1 : Passed");
		} else {
			System.out.println("Test case 1: Failed");
		}
		
	}

}
