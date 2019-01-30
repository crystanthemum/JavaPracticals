/**
 * 
 */
package constructors;

/**
 * @author Crystal
 *
 */
public class Footballer {
	//instance vars, need getters/setters
	private String fname;
	private String lname;
	private int squadNumber;
	private int employeeNumber;
	
	/*
	 * default constructor
	 */
	public Footballer(){
		
	}
	/*
	 * non default constructor
	 */
	public Footballer(String fname, String lname, int squadNumber, int employeeNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.setSquadNumber(squadNumber);
		this.employeeNumber = employeeNumber;
	}
	/**
	 * @param fname
	 * @param lname
	 * @param employeeNumber
	 */
	/*
	 * constructor with no squad number
	 */
	public Footballer(String fname, String lname, int employeeNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.employeeNumber = employeeNumber;
		this.squadNumber = -1; //default at -1 bc squad number not available
		System.out.println("Remind to give this guy a squad number later");
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
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
		//Business rule: minimum number is 1, max number is 99
		if(squadNumber >0 && squadNumber <100) {
			this.squadNumber = squadNumber;
		}
		else {
			System.out.println("Not a valid squad number");
			this.squadNumber=-1;
		}
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
		return "Footballer [fname=" + fname + ", lname=" + lname + ", squadNumber=" + squadNumber + ", employeeNumber="
				+ employeeNumber + "]";
	}
	
	
	
}
