package dryRunAgain;

/**
 * 
 * @author User class for a factory that create car
 */
public class CarFactory {

	public static void main(String[] args) {
		try {
			FamilySaloon f1 = new FamilySaloon("Audi", "A3", 130, true);
			F1 f2 = new F1("Ferrari", "Maranello", 333, 1.24);
			F1 f3 = new F1("McLaren", "MCL2016", 998, 1.12);
			RallyCar f4 = new RallyCar("Subaru", "Impreza", 143, 1.98);
			FamilySaloon f5 = new FamilySaloon("Subaru", "Legacy", 123, true);
			
			F1 f6 = new F1("Ferrari", "Maranello", 99999, 1.12);
			
			f6.displayAll();

			Car[] cars = { f1, f2, f3, f4, f5, f6 };

			// putting car objects into an array

			// getting car model with least horsepower

			int minHP = 0;

			for (int index = 0; index < cars.length; index++) {
				if (cars[index].getHorsePower() < cars[minHP].getHorsePower()) {
					minHP = index;
				}

			}
			System.out.println("Car with least HP\t:" + cars[minHP].getModel());

			System.out.println("Cars that are Subarus ");

			for (Car c : cars) {
				if (c.getMake().equalsIgnoreCase("Subaru")) {
					c.displayAll();
				}
				System.out.println();
			}

			double totalHP = 0.0;

			for (int index = 0; index < cars.length; index++) {
				totalHP += cars[index].getHorsePower();

			}
			double avgHP = totalHP / cars.length;
			System.out.printf("Average HP : %.2f", avgHP);
		} catch (Exception e) {
			System.out.println("Invalid input entered into constructor");
		}
	}
}
