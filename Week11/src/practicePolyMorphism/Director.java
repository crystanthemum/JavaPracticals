package practicePolyMorphism;

public class Director extends Employee {
	@Override
	public void calcWeeklyWages(int hoursWorked) {

		double wages = hoursWorked * this.getBasePay() * 15;
		System.out.println(this.getName() + this.getJobTitle() + this.getBasePay() + wages);
	}
}
