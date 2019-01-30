package payroll;

public class PayrollManager {

	public PayrollManager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.calculateWages(35, 8.00));
		
		Employee e1 = new Employee();
		e1.setName("Crystal");
		System.out.println(e1.getName());
		
	}

}
