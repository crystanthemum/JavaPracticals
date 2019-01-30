package oopInheritance;

public class Programmer extends StaffMember {
	// instance vars

	private String language;

	/*
	 * constructor with parameter
	 */
	
	public Programmer() {

	}

	public Programmer(String firstName, String lastName, String language) {
		super(firstName, lastName);
		this.language = language;
	}

	/**
	 * @return the language
	 */

	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Language: " + language + ", Programmer First Name: " + getFirstName() + ", Last Name: " + getLastName();
	}

}
