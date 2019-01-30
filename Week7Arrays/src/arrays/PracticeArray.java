package arrays;
import java.util.Arrays;
public class PracticeArray {

	public static void main(String[] args) {
		int[]myArray = {1,2,7,85,5,6};
		
		String []myStringArray = {"Bilbo", "Frodo", "Legolas","Gimley"};
		
		System.out.println("Original array : "+ Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("Sorted array : "+ Arrays.toString(myArray));
		
		System.out.println("Original string array : "+ Arrays.toString(myStringArray));
		Arrays.sort(myStringArray);
		System.out.println("Sorted string array : "+ Arrays.toString(myStringArray));
		
		System.out.printf("Average is %2d",getArrayAvg(myArray));
	}
	/*
	 * method will find the average of the elements in an array
	 */
	public static double getArrayAvg(int[]myArray) {
		double arrayTotal=0;
		double arrayAvg = 0;
		
		for(int index = 0; index <myArray.length; index++) {
			arrayTotal+=myArray[index];
		}
		arrayAvg = arrayTotal/myArray.length;
		return arrayAvg;
		
		
	}

}