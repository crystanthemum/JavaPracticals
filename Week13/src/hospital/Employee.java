package hospital;

public abstract class Employee {
	
	//default parameter
	public Employee() {

	}
	
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}
	

	private String firstName;
	private String lastName;
	private Double baseRate;

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
	public Double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(Double baseRate) {
		this.baseRate = baseRate;
	}

	// method to calculate weekly hours

	public abstract void calculateWeeklySalary(double hours);

	public void printAll() {
		System.out.println(
				"Employee firstName = " + firstName + ", lastName=" + lastName + ", baseRate=" + baseRate + "]");
	}

}
