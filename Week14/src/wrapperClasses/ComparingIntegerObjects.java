package wrapperClasses;

public class ComparingIntegerObjects {

	public static void main(String[] args) {
		
		Integer intW1 = new Integer(3);
		Integer intW2 = new Integer(100);
		
		//using equals(return Boolean true if the values 
		//of the object and argument are equal
		
		if(intW1.equals(intW2)) {
			System.out.println("same");
		} else {
			System.out.println("not the same");
		}
		
		//uing compareTo, if two numbers are the same, 
		//it will return 0. if the argument is bigger
		//(intW2 > intW1) a minus number will be returned
		//if the other way round, a positive number
		
		System.out.println("return from compareTo is : "+intW1.compareTo(intW2));
		
	}

}
