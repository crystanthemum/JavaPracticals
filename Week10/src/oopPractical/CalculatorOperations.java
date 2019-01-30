package oopPractical;

public class CalculatorOperations {
	private int memory;

	// default constructor
	public CalculatorOperations() {

	}

	/**
	 * @param memory
	 */
	public CalculatorOperations(int memory) {
		super();
		this.memory = memory;
	}


	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}

	public int subtract(int num1, int num2) {
		return num1-num2;
	}

	public int multiple(int num1, int num2) {
		return num1*num2;
	}

	public int divide(int num1, int num2) {
		return num1/num2;
	}

	public double sqrRoot(int num1) {
		 return Math.sqrt(num1);
	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void clearMemory() {

	}
}
