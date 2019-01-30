/**
 * 
 */
package practical_constructors_inheritance;
/**
 * @author User
 *
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Whale w1 = new Whale("Right", "Atlantic", 2001, 23, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback", "Antarctic", 919, 13, 13);

		/*
		 * Array that stores Whale objects
		 */
		Whale[] whaleArray = { w1, w2, w3, w4 };

		getDetails(whaleArray);
		getAtlanticWhales(whaleArray, "Atlantic");
		getFastestWhale(whaleArray);
		getAvg(whaleArray);
		getHeaviest(whaleArray);
		getFastest(whaleArray);
		
		/**
		 *  Testing the valid argument
		 */
		System.out.println("Testing invalid argument");
		Whale w5 = new Whale("Whale name", "Ocean name", 600, 50, 60);
		System.out.println(w5);

		/**sorting the children array
				System.out.println("Sorting the children array");
				Arrays.sort(children);
				System.out.println(Arrays.toString(children));
				**/
	
	}

	public static void getDetails(Animal[] whaleArray) {

		for (int index = 0; index < whaleArray.length; index++) {
			System.out.println(whaleArray[index]);
		}
	}
	/**
	 * 
	 */
	
	public static void getWhalesByOceal(Whale[]whaleArray, String ocean) {
		
		
		
		/**
		System.out.println("Names of whales that swim in the "+ocean);
		for (int loop=0;loop<whales.length;loop++){
			if (whales[loop].getMainOcean().equals(ocean)){
				System.out.println(whales[loop].getName());
				
			}
		}**/
	}
		
	
	/**
	 * method that returns whales that swim in the Atlantic ocean
	 * 
	 * @param whaleArray
	 */
	public static void getAtlanticWhales(Whale[] whaleArray, String ocean) {
		{
			for (int index = 0; index < whaleArray.length; index++)
				if (whaleArray[index].getMainOcean().equalsIgnoreCase(ocean)) {
					System.out.println("Whales that swim in the " + ocean + " :" + whaleArray[index].getName());
				}
		}
	}

	/**
	 * method that outputs the fastest whale
	 */
	public static void getFastestWhale(Whale[] whaleArray) {
		int fastestWhale = 0;

		for (int index = 0; index < whaleArray.length; index++) {
			if (whaleArray[index].getMaxSpeed() > whaleArray[fastestWhale].getMaxSpeed()) {
				fastestWhale = index;
			}
		}
		System.out.println(
				"Fastest whale: " + whaleArray[fastestWhale].getName() + " " + whaleArray[fastestWhale].getMaxSpeed());
	}

	/**
	 * method to return average weight of the whales
	 */
	public static void getAvg(Whale[] whaleArray) {

		double totalWeight = 0;
		for (int index = 0; index < whaleArray.length; index++) {
			totalWeight += whaleArray[index].getWeight();
		}
		System.out.printf("Average weight : %.2f tonnes", totalWeight / whaleArray.length);
		System.out.println();
	}

	/**
	 * method to return heaviest whale
	 */
	public static void getHeaviest(Whale[] whaleArray) {
		int heaviest = 0;
		for (int index = 0; index < whaleArray.length; index++) {
			if (whaleArray[index].getWeight() > whaleArray[heaviest].getWeight()) {
				heaviest = index;
			}
		}
		for (int index = 0; index < whaleArray.length; index++) {
			if (whaleArray[heaviest].getWeight() == whaleArray[index].getWeight()) {
				System.out.println("Heaviest whale\t:" +whaleArray[index].getName());
				// got index w heaviest whale. loop through all the whales, compare their
				// weights to that weight, if they match, print whales name
			}
		}
	}
	
	public static void getFastest(Whale[]whaleArray) {
		
		System.out.println("---------------get multiple whales---------------");
		
		int fastest = whaleArray[0].getMaxSpeed();
		//finding the fastest speed
		for(int index = 0; index < whaleArray.length; index++) {
			if(whaleArray[index].getMaxSpeed() > fastest) {
				fastest = whaleArray[index].getMaxSpeed();
			}
		}
		for(int index = 0; index < whaleArray.length; index++) {
			if(whaleArray[index].getMaxSpeed() == fastest) {
				System.out.println(whaleArray[index].getName());
			}
		}
		System.out.println("---------------get multiple whales---------------");
	}
	
	
}
