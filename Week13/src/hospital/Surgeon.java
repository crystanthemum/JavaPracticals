package hospital;

public class Surgeon extends Employee {

	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateWeeklySalary(double hours) {

		System.out.printf("%s %s weekly salary : %.2f \n", this.getFirstName(), this.getLastName(),(hours * this.getBaseRate() + this.consultationFee));

	}

	@Override
	public void printAll() {
		System.out.println(
				"Employee firstName = " + this.getFirstName() + ", lastName=" + this.getLastName() + ", baseRate=" + this.getBaseRate() + ", specialist area : "+this.getSpecialistArea()+ ", consultation fee "+ this.consultationFee);

	}

	// instance variables

	private String specialistArea;
	private double consultationFee;

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

}
