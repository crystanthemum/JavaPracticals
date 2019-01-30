package iPayable;

public class Lecturer extends Employee implements IPayable {

	public Lecturer() {
	}
	
	private String subject;

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void displayAll() {
		System.out.println("First name : " + this.getFirstName());
		System.out.println("Last name : "+ this.getLastName());
		System.out.println("Subject : "+ this.getSubject());
	}

	@Override
	public void payWage(double hours, double rate) {
		System.out.println("Wage : £"+hours*rate*1.3);
		
	}
	
	

}
