/**
 * 
 */
package practical4;

/**
 * @author User
 *
 */
public class Part_7 {

	public static void main(String[] args) {
		int countDown=1000;
		for ( ;countDown >=0;countDown--) {
			System.out.println(countDown);
		
		if (countDown ==333) {
			System.out.println("Launch aborted!");
			break;
		}
	}
}
}
