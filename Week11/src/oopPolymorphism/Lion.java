package oopPolymorphism;
//can type in Animal class as the superclass and it'll do the extends for us
public class Lion extends Animal {

	/* (non-Javadoc)
	 * @see oopPolymorphism.Animal#makeNoise()
	 */
	@Override //SOURCE -> Override/Implement methods
	/**
	 * method for lion to roar
	 */
	public void makeNoise() {
		System.out.println("Lion goes ROAR");
		/*
		// TODO Auto-generated method stub
		super.makeNoise();
		*/
	}
	
}
