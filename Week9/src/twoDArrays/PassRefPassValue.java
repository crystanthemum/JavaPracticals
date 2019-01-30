package twoDArrays;


import java.util.Arrays;

public class PassRefPassValue {

	public static void main(String[] args) {
		// ARRAYS ARE OBJECTS. passing an object into a method works
		int [] myArray = {2,4,6,8,10};
		System.out.println(Arrays.toString(myArray));
		// pass by REFERENCE
		upDateArray(myArray);
		System.out.println(Arrays.toString(myArray));
		
		//call the method with a value and print out before the call and after
		// PASSING PRIMINITIVE TYPES TO A METHOD WOULDNT CHANGE IT
		// difference between pass by reference vs pass by value
		// passing objects changes, not passing the value but a reference to the memory 
		int number = 999;
		System.out.println(number);
		// pass by VALUE
		updateNum(number);
		System.out.println(number);
	}
	public static void upDateArray(int[] anArray) {
		for (int loop =0;loop<anArray.length;loop++) {
			anArray[loop]++;
		}
	}
	public static void updateNum (int a) {
		a++;
	}
}
