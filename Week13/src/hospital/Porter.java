package hospital;

public class Porter extends Employee {

	public Porter() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
		// TODO Auto-generated constructor stub
	}
	private String site;

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	@Override

	public void printAll() {
		System.out.println(
				"Employee firstName = " + this.getFirstName() + ", lastName=" + this.getLastName() + ", baseRate=" + this.getBaseRate() + " site : "+ this.getSite());
	}

	@Override
	public void calculateWeeklySalary(double hours) {

		System.out.printf("%s %s weekly salary : %.2f\n", this.getFirstName(), this.getLastName(), hours * this.getBaseRate());

	}

}
