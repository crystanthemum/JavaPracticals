package whales;

public class WhaleWatcher {

	public static void main(String[] args) {
		
		// array to store whale objects
		
		Whale w1 = new Whale("Atlantic", 2001, 21, 16, "Right");
		Whale w2 = new Whale("Pacific", 2001, 23, 16, "Blue");
		Whale w3 = new Whale("Atlantic", 1900,20,40, "Sperm");
		Whale w4 = new Whale("Antartic", 919, 13, 13, "Humpback");
		
		//array to store whale objects
		
		Whale[] whaleArray = {w1,w2,w3,w4};
		
		//METHODS
		displayAll(whaleArray);
		
	}
	/**
	 * method to output all details
	 */
	public static void displayAll(Whale[]whaleArray) {
		
		for(Whale whaleObject: whaleArray) {
			System.out.println(whaleObject.toString());
		}
		
		
	}
	/**
	 * method to get names of whale that swim in the atlantic
	 */
	
	/**
	 * method to get fastest whale(s)
	 */
	
	/**
	 * get average length for all whales
	 */
	
	/**
	 * get heaviest whales
	 */

}
