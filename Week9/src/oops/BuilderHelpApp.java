package oops;

public class BuilderHelpApp {

	public static void main(String[] args) {
		UnitConverter unitCon = new UnitConverter();
		double inches = unitCon.cmToInches(2.30);
		System.out.println(inches + " inches");
		
		
		double cm = unitCon.inchesTocm(5.999);
		System.out.println(cm + " cm");
		
		double miles = unitCon.kmToMiles(4.22);
		System.out.println(miles + " miles");
		
		
		
		
		

	}

}
