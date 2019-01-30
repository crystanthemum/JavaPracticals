package oopInheritance;

public class Mechanic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setName("Mini Cooper");
		car1.setNumberOfWheels(4);
		car1.setPowerType("Diesel");
		System.out.println(car1.toString());

		Ship ship1 = new Ship();
		ship1.setTonnage(4);
		ship1.setName("Shippy McShipFace");
		ship1.setPowerType("Steam??");
		System.out.println(ship1.toString());

		Car car2 = new Car(4, "Mercedes Benz", "Diesel");
		System.out.println(car2);

		Ship ship2 = new Ship(5, "SS Nomadic", "it doesn't move...it's a tourist attraction");
		System.out.println(ship2);
		
		Car car3 = new Car(4, "Porsche","Petrol");
		System.out.println(car3);
		
	}

}
