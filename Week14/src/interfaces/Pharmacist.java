/**
 * 
 */
package interfaces;

/**
 * @author User
 *
 */
public class Pharmacist extends Employee implements IAdministerDrugs{

	/**
	 * default constructor
	 */
	public Pharmacist() {
	}
	
	/**
	 * constructor with arguments
	 */
	
	
	// instance vars
	private int grade;
	/**
	 * @param grade
	 * @param bonus
	 */


	private double bonus;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus, boolean adminControlledDrug, boolean adminNonControlledDrug) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
		this.adminControlledDrug();
		this.adminNonControlledDrug();
	}

	

	/**
	 * method to calculate weekly salary
	 */
	public void calculateWeeklySalary(double hours) {
		System.out.println(hours*this.getBaseRate()+this.bonus);
	}
	
	/**
	 * method to print all details
	 */
	
	
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/* (non-Javadoc)
	 * @see interfaces.Employee#printAll()
	 */
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
		System.out.println("Pharmacist : grade "+ this.getGrade());
		System.out.println("Pharmacist : admin noncontrolled drug : true");
		System.out.println("Pharamcist : admin controlled drug : true");
		System.out.println("Bonus : "+this.getBonus());
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

	@Override
	public boolean adminControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean adminNonControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	

}
