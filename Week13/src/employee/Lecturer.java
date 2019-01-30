package employee;

public class Lecturer extends Employee {
	
	public Lecturer() {
		
	}
	
	@Override
	public void calSal(int rate, int hours) {
		System.out.println("Lecturer salary: "+ rate*hours*1.5);
	}
	
	
}
