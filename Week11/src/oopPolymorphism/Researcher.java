package oopPolymorphism;

public class Researcher extends Employee {
	private String school;

	public Researcher() {

	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param name
	 * @param jobTitle
	 */

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	public void calculateWeeklyWages(int hoursWorked) {

		double wages = hoursWorked * getBasePay() * 30.5; // need the accessor to get base pay bc it was set as private
		displayAll();
		System.out.println("Wages:" + wages);

	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("school : " + this.school);
	}

}
