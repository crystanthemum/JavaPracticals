package wrapperClasses;

public class One {

	public One() {
		// TODO Auto-generated constructor stub
	}
	
	//deprecated: method using still works but there is a better, newer alternative.

	public static void main(String[] args) {
		// object
		int myNum = 33;
		// wrapper. 56 is an arg passed into the constructor
		Integer myInt = new Integer(56);

		System.out.println(myNum);
		System.out.println(myInt);

		// text as a num
		Integer myInt2 = new Integer("45");
		System.out.println(myInt2);
		
		//not good. but good for formatting for HTML and database
		//Integer problem = new Integer("Ten");//
		
		System.out.println("-----------------------------");
		
		Integer myI = new Integer("34");
		int weeInt = myI.intValue();
		System.out.println("int value "+weeInt);
		
		//utility type function example
		System.out.println("BIGGEST : "+Integer.max(weeInt, myI));
		
		//casting the integer into a double
		double weeD = myI.doubleValue();
		System.out.println(weeD);
		
		int myInteger = Integer.parseInt("10");
		System.out.println(myInteger);
		
		//addition of int and double
		Double myD = myI.doubleValue() + 3.4;
		System.out.println(myD);
		
	}

}
