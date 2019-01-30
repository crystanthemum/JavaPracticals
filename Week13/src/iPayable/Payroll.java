/**
 * 
 */
package iPayable;

/**
 * @author User
 *
 */
public class Payroll {

	/**
	 * 
	 */
	public Payroll() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Researcher r1 = new Researcher();
		r1.setFirstName("Paul");
		r1.setLastName("Wilson");
		r1.setResearchArea("Psychology statistics");
		r1.displayAll();
		r1.payWage(35.00, 16.50);

		Lecturer l1 = new Lecturer();
		l1.setFirstName("Peter");
		l1.setLastName("Hepper");
		l1.setSubject("Psychology - serial killers");
		l1.displayAll();
		l1.payWage(35, 42.00);

		Student s1 = new Student();
		s1.setFirstName("Crystal");
		s1.setLastName("Fong");
		s1.setStudentNumber(40126743);
		s1.displayAll();

	}

}
