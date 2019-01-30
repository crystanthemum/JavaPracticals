package objectOrientatedProgramming;

public class Footballers {
	// instance vars (must be PRIVATE and declare it at the top)
	private String fName;
	private String lName;
	private int squadNumber;
	private int employeeNumber;
	/**
	 * @return the fName
	 */
	
	// constructors
	/**
	 * Default constructor
	 */
	public Footballers() {
		System.out.println("Creating a footballer"); //the first line of code that will appear
	}
	/*
	 * Constructor with arguments
	 */
	public Footballers(String fName, String lName, int squadNumber, int employeeNumber) {
		this.fName = fName;
		this.lName = lName;
		this.squadNumber = squadNumber;
		this.employeeNumber = employeeNumber;
	}
	
	// methods
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the squadNumber
	 */
	public int getSquadNumber() {
		return squadNumber;
	}
	/**
	 * @param squadNumber the squadNumber to set
	 */
	public void setSquadNumber(int squadNumber) {
		this.squadNumber = squadNumber;
	}
	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Footballers [fName=" + fName + ", lName=" + lName + ", squadNumber=" + squadNumber + ", employeeNumber="
				+ employeeNumber + "]";
	}

	





	
	
	
}
