package employee;

public class SalaryProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e = new Employee();
		//e.calSal(10, 10);

		Lecturer l = new Lecturer();
		l.calSal(10, 10);
		
		Professor p = new Professor("Paul", "Wilson");
		p.calSal(10, 10);
		
		Reader r = new Reader();
		r.calSal(10, 10);
	}
}
