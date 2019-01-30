package practical_constructors_inheritance;

public class WhaleWatcherAGAIN {

	public static void main(String[] args) {
		
		Whale w1 = new Whale("Right", "Atlantic", 499, 23, 16);
		Whale w2 = new Whale("Blue", "Pacific", 499, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 499, 20, 40);
		Whale w4 = new Whale("Humpback", "Antarctic", 499, 13, 13);

		/*
		 * Array that stores Whale objects
		 */
		Whale[] whaleArray = { w1, w2, w3, w4 };
		
		displayall(whaleArray);
		getWhaleByOcean(whaleArray, "Atlantic");
	}
	
	public static void displayall(Whale[]whaleArray){
	
		for(int index = 0; index < whaleArray.length; index++) {
			whaleArray[index].toString();
				}
	}
	
	public static void getWhaleByOcean(Whale[]whaleArray, String ocean) {
		
		for(int index = 0; index < whaleArray.length; index++) {
			if(whaleArray[index].getMainOcean().equalsIgnoreCase(ocean)) {
				System.out.println(whaleArray[index].getName());
			}
		}
	}
}
