package practicePolyMorphism;

public class Surgeon extends Employee {

	/**
	 * surgeon subclass overrides the cut method from Employee superclass
	 */

	@Override
	public void calcWeeklyWages(int hoursWorked) {
		double wages = hoursWorked * this.getBasePay() * 20;
		System.out.println(this.getName() + this.getJobTitle() + this.getBasePay() + wages);

	}
}
