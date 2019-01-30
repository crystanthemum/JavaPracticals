/**
 * 
 */
package iPayable;

/**
 * @author User
 *
 */
public class Tester {

	/**
	 * 
	 */
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lecturer l = new Lecturer();
		l.payWage(35, 10.00);
		
		Researcher r = new Researcher();
		r.setResearchArea("History");
		r.displayAll();
		r.payWage(35, 9.66);
		
	}

}
