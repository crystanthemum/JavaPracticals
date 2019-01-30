package practicePolyMorphism;

public class Cat extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Cat goes meow");
	}
	
	//overriding the eat method in the Animal superclass to own preferences
	@Override
	public void eats() {
		System.out.println("Cats eat fish");
	}
	
}
