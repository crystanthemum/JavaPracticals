/**
 * 
 */
package oopPolymorphism;

/**
 * @author User
 *
 */
public class PayrollManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee("Joe Soap", "Cleaner");
		e1.displayAll();
		e1.calculateWeeklyWages(40);

		Lecturer l2 = new Lecturer();
		l2.setName("Paul Wilson");
		l2.setJobTitle("Lecturer");
		l2.setSubject("Statistics");

		l2.calculateWeeklyWages(40);
		System.out.println("--------");
		l2.displayAll();

		Researcher r1 = new Researcher();
		r1.setName("Aidan McG");
		r1.setJobTitle("Researcher");
		r1.setSchool("CSB");
		r1.displayAll();

		Employee[] employees = { e1, l2, r1 };
		processWages(employees);
	}

	/**
	 * method to calculate wages with employee array
	 * 
	 * @param employees
	 */
	public static void processWages(Employee[] employees) {

		for (Employee employee : employees) {
			employee.calculateWeeklyWages(40);
		}

	}
}
