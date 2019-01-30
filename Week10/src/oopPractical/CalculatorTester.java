package oopPractical;

public class CalculatorTester {

	public static void main(String[] args) {
		
		CalculatorOperations cal1 = new CalculatorOperations();
		System.out.println(cal1.addNumbers(7, 5));
		
		CalculatorOperations cal2 = new CalculatorOperations();
		System.out.println(cal2.subtract(8, 1));
		
		CalculatorOperations cal3 = new CalculatorOperations(5);
		System.out.println(cal3.multiple(8, 8));
		
	}

}
