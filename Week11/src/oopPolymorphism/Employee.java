package oopPolymorphism;

/**
 * 
 * @author User
 *
 */
public class Employee {
	// instant variables
	private String name;
	private String jobTitle;
	private double basePay = 30.00; //sets the constant of 30.00
	
	//default constructor 
	public Employee() {
		
	}
	//constructor with arguments
	public Employee(String name, String jobTitle) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		
	}
	/**
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

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the basePay
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * @param basePay the basePay to set
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	/**
	 * method to work out weekly wages
	 * @param hoursWorked
	 */
	public void calculateWeeklyWages(int hoursWorked) {
		double wages = hoursWorked * this.basePay;
		displayAll();
		System.out.printf("%s : %s : £%.2f", this.name, this.jobTitle, +wages);
	}
	/**
	 * method to display employee details
	 */
	public void displayAll() {
		System.out.println("Name : "+this.name );
		System.out.println("Job title : "+this.jobTitle);
		System.out.println("Base pay : "+ this.basePay);
	}
}
