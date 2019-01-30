package oopPractical;

public class CarFactory {

	public static void main(String[] args) {
		Car c1 = new Car("Ford", "Fiesta", "Blue", 4, 1.2, 110, false);
		System.out.println(c1.toString());
		Car c2 = new Car("Peugeot", "308","Silver",4,1.8,130, false);
		System.out.println(c2.toString());
		Car c3 = new Car("Ferrari","F4","Red",2,2.8,230,false);
		System.out.println(c3.toString());
		
		c1.startCar();
		c1.startCar();
		c1.stopCar();
		
		
	}
}
