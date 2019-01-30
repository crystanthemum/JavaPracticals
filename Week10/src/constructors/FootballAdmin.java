/**
 * 
 */
package constructors;

/**
 * @author User
 *
 */
public class FootballAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Footballer f1 = new Footballer();
		f1.setFname("Gareth");
		f1.setLname("Bale");
		f1.setEmployeeNumber(123456);
		f1.setSquadNumber(10);
		
		System.out.println(f1.getFname() + " " + f1.getLname());
		System.out.println(f1.toString());
		
		Footballer f2 = new Footballer("George", "Best", 999, 123456);
		System.out.println(f2.toString());
		
		Footballer f3 = new Footballer("Dennis", "Law", 123412);
		System.out.println(f3.toString());
		
		f1.setSquadNumber(100); 
	}
	
	}
	


