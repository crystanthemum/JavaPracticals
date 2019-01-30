package oopInheritance;

public class StaffMember {

	/*
	 * this class will store staff member details
	 */
	// instance variables
	private String firstName;
	private String lastName;

	/*
	 * DEFAULT CONSTRUCTOR
	 */
	StaffMember() {
	}

	/*
	 * CONSTRUCTOR WITH ARGUMENTS
	 */
	StaffMember(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * 
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Staff Member first name: " + firstName + ", Staff Member last name: " + lastName;
	}

}