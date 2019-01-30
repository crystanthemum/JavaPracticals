package employee;

public class Professor extends Employee {

	public Professor(String firstName, String lastName) {

	}

	@Override
	public void calSal(int rate, int hours) {
		System.out.println("Professor salary: " + rate * hours * 2.5);
	}

}

//if you make a method abstract, the whole class has to  be abstract as well
