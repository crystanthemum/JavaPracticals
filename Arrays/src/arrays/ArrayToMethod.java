package arrays;
public class ArrayToMethod {

	public static void main(String[] args) {
		//array is an object, not a primitive type
		
		int[] hourlyTemps = {2,3,4,5,6,8,10};
		int [] dailyTemp = {4,5};
		
		//calling the displayTemps method below
		
		displayTemps(hourlyTemps);
		System.out.println("____hourly temps -1____");
		modifyTemps(hourlyTemps,-1);
		displayTemps(hourlyTemps);
		
		displayTemps(dailyTemp);
		modifyTemps(dailyTemp,-1);
		displayTemps(dailyTemp);
		
		
		// the temp readings are incorrect by 1 degree -
		
	}
	/*PROBLEM:creating a method + passing an array into it
	method name should not be the same as vars above*/
	/*
	 * ANSWER: write a new method that modifies the array
	 */
	public static void displayTemps(int[]temps) {
		
		for (int loop = 0; loop < temps.length; loop++) {
			System.out.println(temps[loop]);
			
		}
	//method created: now need to call it in the main method
	}
	public static void modifyTemps(int[]temps,int offset) {
		for (int loop = 0; loop < temps.length; loop++){
			temps [loop] = temps[loop] + offset;
		}
	}
}
