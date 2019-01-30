package hospital;

public class PayrollManager {

	public PayrollManager() {
		// TODO Auto-generated constructor stub
	}

	public static int HOURS_PER_WEEK = 35;

	// static variable to hold employees
	public static Employee[] employees = new Employee[6];
	static int numEmployees = 0;

	public static void addEmployeeToList(Employee e) {

		if (numEmployees + 1 < employees.length) {
			employees[numEmployees] = e;
			numEmployees++;
		} else {
			System.out.println("no more vacancies");

		}

	}

	public static void displayAllEmployees() {

		for (Employee employee : employees) {
			if (employee != null) {
				employee.printAll();
			}
		}
	}

	public static void processWeeklyPayroll() {

		for (Employee employee : employees) {
			if (employee != null) {
				employee.calculateWeeklySalary(HOURS_PER_WEEK);

			}
		}

	}

	public static void main(String[] args) {

		Employee p1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee p2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee s1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee s2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee ph1 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);

		addEmployeeToList(p1);
		addEmployeeToList(p2);
		addEmployeeToList(s1);
		addEmployeeToList(s2);
		addEmployeeToList(ph1);

		processWeeklyPayroll();
		displayAllEmployees();

	}

}
