package iPayable;

public class Student extends Employee {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	private int studentNumber;

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void displayAll() {
		System.out.println("First name : " + this.getFirstName());
		System.out.println("Last name : "+ this.getLastName());
		System.out.println("Student number : "+ this.getStudentNumber());
	}

}
