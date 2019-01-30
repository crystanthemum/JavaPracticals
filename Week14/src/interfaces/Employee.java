/**
 * 
 */
package interfaces;

/**
 * @author User this class is for employee
 */
public abstract class Employee {

	/**
	 * default constructor
	 */
	public Employee() {
	}

	/**
	 * method to calculate employee's weekly salary
	 */
	public void calculateWeeklySalary(double hours) {
		System.out.println("Weekly wage " + hours * this.getBaseRate());
	}

	/**
	 * constructor with arguments
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}

	/**
	 * method to print employee's details
	 */
	public void printAll() {
		System.out.println(
				"First name : " + this.firstName + "Last name : " + this.lastName + "Base rate : " + this.baseRate);
	}

	// instance vars
	private String firstName;
	private String lastName;
	private double baseRate;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}

}
