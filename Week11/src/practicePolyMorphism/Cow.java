package practicePolyMorphism;

public class Cow extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Cow goes moooooo");
	}
	@Override
	public void eats() {
		System.out.println("Cows eat grass");
	}
}
