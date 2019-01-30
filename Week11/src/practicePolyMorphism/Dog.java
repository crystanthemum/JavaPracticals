package practicePolyMorphism;

public class Dog extends Animal {
	
	@Override
	public void makeNoise() {
		System.out.println("Dog goes woof");
	}
	
	@Override
	public void eats() {
		System.out.println("Dogs eat carrots");
	}

}
