package fruit;

public class MarketStall {

	public static void main(String[] args) {

		// creating new fruits

		Apple a1 = new Apple("Apple", "Red", "White", 4, true, "Pink lady");
		Apple a2 = new Apple("Apple", "Red", "White", 6, true, "Red delicious");
		Apple a3 = new Apple("Apple", "Green", "White", 5, false, "Granny Smith");
		Banana b1 = new Banana("Banana", "Yellow", "White", 0, false, "banananaaaaaaa");
		Mango m1 = new Mango("Mango", "Green", "Orange", 1, false, "UK");
		Mango m2 = new Mango("Mango", "Yellow", "Yellow", 1, true, "India");

		Fruit[] fruitArray = { a1, a2, a3, b1, m1, m2 };
		displayAll(fruitArray);
		getFav(fruitArray);
		getAvgPips(fruitArray);

		/**
		 * method to display detail of all fruit
		 */
	}

	public static void displayAll(Fruit[] fruitArray) {
		for (Fruit f : fruitArray) {
			System.out.println(f.toString());
		}
	}

	/**
	 * method to get my favourite fruits
	 * 
	 * @param fruitArray
	 */
	public static void getFav(Fruit[] fruitArray) {
		for (Fruit f : fruitArray) {
			if (f.isFavourite() == true) {
				System.out.println(f.getName());
			}
		}
	}

	/**
	 * method to get average number of pips
	 */
	public static void getAvgPips(Fruit[] fruitArray) {

		int totalPips = 0;
		for (Fruit f : fruitArray) {
			totalPips += f.getPips();
		}
		System.out.println("Average number of pips\t: " + totalPips / fruitArray.length);
		System.out.println("Total number of pips\t: " + totalPips);
	}

}
