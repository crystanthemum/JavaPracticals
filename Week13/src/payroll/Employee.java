package payroll;

public class Employee implements IPayable {

	public Employee() {
	}

	@Override
	public double calculateWages(double hoursWorked, double payRate) {
		return hoursWorked*payRate;
		// TODO Auto-generated method stub
		
	}
	
	//instance variables
	private String name;

	/**
	 * method to get the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
