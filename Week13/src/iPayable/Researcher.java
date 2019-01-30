package iPayable;

public class Researcher extends Employee implements IPayable {

	public Researcher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param researchArea
	 */
	public Researcher(String firstName, String lastName, String researchArea, double payWage) {
		super();

		this.researchArea = researchArea;
	}

	@Override
	public void payWage(double hours, double rate) {
		System.out.println("Wage : £" + hours * rate * 1.2);
	}

	private String researchArea;

	/**
	 * @return the researchArea
	 */
	public String getResearchArea() {
		return researchArea;
	}

	/**
	 * @param researchArea the researchArea to set
	 */
	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	public void displayAll() {
		System.out.println("First name : " + this.getFirstName());
		System.out.println("Last name : " + this.getLastName());
		System.out.println("Research area :" + this.researchArea);
	}

}
