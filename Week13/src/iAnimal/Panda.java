package iAnimal;

public class Panda implements IAnimal {

	public Panda() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Panda shuffles");
	}

	@Override
	public void makeNoise() {
		System.out.println("Panda zzzzzz");
	}

	@Override
	public void eat() {
		System.out.println("Panda eats bamboo");
	}

}
