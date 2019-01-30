package iAnimal;

public class Lion implements IAnimal {

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Lion runs to catch prey");
	}

	@Override
	public void makeNoise() {
		System.out.println("Lion goes roooaaaaarrrrrr");
	}

	@Override
	public void eat() {
		System.out.println("Lion eats a zebra");
	}

}
