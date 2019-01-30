package dryRun;

/**
 * 
 * @author Crystal Fong student number: 40126743
 *
 */
public class CarFactory {

	public static void main(String[] args) {
		Car c1 = new FamilySaloon("Audi", "A3", 130, true);
		Car c2 = new F1("Ferrari", "Maranello", 333, 1.24);
		Car c3 = new F1("McLaren", "MCL2016", 998, 1.12);
		Car c4 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		Car c5 = new FamilySaloon("Subaru", "Legacy", 123, true);

		Car[] carArray = { c1, c2, c3, c4, c5 };

		for (int index = 0; index < carArray.length; index++) {
			carArray[index].displayAll();
		}

		/**
		 * To find the car with the least horsepower
		 */
		int indexOfCarWSmallestHP = 0;

		for (int index = 0; index < carArray.length; index++) {
			if (carArray[index].getHorsePower() < carArray[indexOfCarWSmallestHP].getHorsePower()) {
				indexOfCarWSmallestHP = index;
			}
		}
		System.out.println(carArray[indexOfCarWSmallestHP].getModel());
		/**
		 * 
		 */
		System.out.println("-------Displaying details of any car with Subaru make");
		for (Car car : carArray) {
			if (car.getMake().equalsIgnoreCase("subaru")) {
				car.displayAll();
			}
		}

		// c) Output the average horsePower for all the car objects. (Display to two
		// decimal places).
		int totalHP = 0;
		double avgHP = 0;
		for (int index = 0; index < carArray.length; index++) {
			totalHP += carArray[index].getHorsePower();
			avgHP = (double) totalHP / carArray.length;

		}
		System.out.printf("Average Horsepower = %.2f", avgHP);

	}

}
