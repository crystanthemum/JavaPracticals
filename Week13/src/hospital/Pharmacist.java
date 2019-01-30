package hospital;

public class Pharmacist extends Employee {

	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateWeeklySalary(double hours) {

		System.out.printf("%s %s weekly salary : %.2f \n", this.getFirstName(), this.getLastName(),(hours * this.getBaseRate() + bonus));

	}

	@Override
	public void printAll() {
		System.out.println(
				"Employee firstName = " + this.getFirstName() + ", lastName=" + this.getLastName() + 
				", baseRate=" + this.getBaseRate() + " grade : "+this.getGrade()+ " bonus : "+ this.getBonus());
	}

	// instance variables

	private int grade;
	private double bonus;

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
