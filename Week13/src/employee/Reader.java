package employee;

public class Reader extends Employee {

	public Reader() {
		
	}
	public Reader(String firstName, String lastName) {
	}
	
	@Override
	public void calSal(int rate, int hours) {
		System.out.println(rate*hours*1.1);
	}
}
