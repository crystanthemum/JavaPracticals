/**
 * 
 */
package oopPolymorphism;

/**
 * @author Crystal
 *
 */
public class Lecturer extends Employee {
	//instance variables
	private String subject;
	
	public Lecturer(){}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/* (non-Javadoc)
	 * @see oopPolymorphism.Employee#calculateWeeklyWages(int)
	 */
	/**
	 * method to alter wages for lecturer
	 */
	@Override
	public void calculateWeeklyWages(int hoursWorked) {
		
		double wages = hoursWorked * getBasePay() *20.2; //need the accessor to get base pay bc it was set as private
		displayAll();
		System.out.println("Wages:"+wages);
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
		
	}
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("subject : "+this.subject);
	}
}
