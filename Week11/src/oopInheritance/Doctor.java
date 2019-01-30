package oopInheritance;

public class Doctor extends StaffMember {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	private int ward;
	
	//DEFAULT CONSTRUCTOR
	public Doctor() {
		
	}
	//CONSTRUCTOR WITH ARGUMENTS
	public Doctor(String firstName, String lastName, int ward) {
		
		//using SUPER constructor, (from the staff member class)
		super(firstName, lastName);
		
		this.ward = ward;
		
		/* 
		this.firstName = firstName; (cant access it bc its private, only accessible in staff member class
		this.lastName = lastName;
		this.ward = ward;
		
		THEREFORE NEEDS TO USE GETTER AND SETTERS to get variables from superclass to subclass
		*/
		this.setFirstName("Doctor");
		this.setLastName("Watson");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ward: " + ward + ", First Name: " + getFirstName() + ", Last Name: " + getLastName();
			
	}

	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}
	

}
