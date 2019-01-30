/**
 * 
 */
package interfaces;

/**
 * @author User
 *
 */
public class HospitalTester {

	/**
	 * 
	 */
	public HospitalTester() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pharmacist p = new Pharmacist();
		p.setBaseRate(12.00);
		p.adminControlledDrug();
		p.adminNonControlledDrug();
		p.setFirstName("Winnie");
		p.setLastName("Poon");
		p.setBonus(85.00);
		p.setGrade(7);
		p.printAll();
		p.calculateWeeklySalary(35.00);
		System.out.println();
		Pharmacist p1 = new Pharmacist("Jane", "Doe", 15.00, 4, 85.00, true, true);
		p1.printAll();
		
		Surgeon s = new Surgeon("Red", "John", 35.00, false, true, "cardiac", 800.00);
		s.printAll();
		s.calculateWeeklySalary(35);
		
	}

}
