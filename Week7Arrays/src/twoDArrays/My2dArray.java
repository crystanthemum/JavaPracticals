package twoDArrays;

import java.util.Arrays;

public class My2dArray {

	public static void main(String[] args) {

		// initialising a 2D array with 5 rows and 5 columns

		int[][] myIntArray = new int[5][5];

		// populating the array

		// 1. first value to be set in the array

		int number = 3;

		// assigning 3 to all the elements

		for (int rowCounter = 0; rowCounter < myIntArray.length; rowCounter++) {
			for (int colCounter = 0; colCounter < myIntArray.length; colCounter++) {
				myIntArray[rowCounter][colCounter] = number;
				number *= 3;
			}
		}

		int[][] TwoDarray = { { 1, 2, 3, 4, 5, 6 }, { 20, 21, 22 }, { 3, 6, 9, 12, 15, 18, 21, 24 } };

		for (int row = 0; row < TwoDarray.length; row++) {
			System.out.println(Arrays.toString(TwoDarray[row]));
		}

		System.out.println("-----------------");

		// Declare a 2D array called myArray
		int element = 1;
		int[][] myArray = new int[5][5];
		// Populating myArray
		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				myArray[row][col] = element;
				element+=3;
			}
		}
		// Displaying all the elements of myArray

		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				System.out.printf("%d\t", myArray[row][col]);
			}System.out.println("\n");
		}
		System.out.println("----------------------------------------------------------------\n");
		// Declare array2
		int [][] intArray = new int[5][5];
		
		// populating it
		
		int num = 100;
		
		for(int row = 0; row < intArray.length; row++) {
			for(int col = 0; col < intArray[row].length; col++) {
				intArray[row][col] = num;
				num+=100;
			}
		}
		
		//showing the elements in intArray
		
		for(int row = 0; row < intArray.length; row++) {
			for(int col = 0; col < intArray[row].length; col++) {
				System.out.printf("%d \t",intArray[row][col]);
			} System.out.println("\n");
		}
		
		System.out.println("----------------------------one more time---------------------------------------");
		
		//declare 2d array
		
		int[][] arrayOne = new int[10][10];
		
		
		//populate it 
		
		double firstElement = 200;
		
		for(int row = 0; row < arrayOne.length; row++) {
			for(int col = 0; col <arrayOne[row].length; col++) {
				arrayOne[row][col] = (int)firstElement;
				firstElement-=3;
			}
		}
		
		//display it
		
		for (int row = 0; row < arrayOne.length; row++) {
			for(int col = 0; col < arrayOne[row].length; col++) {
				System.out.printf("%d \t" , arrayOne[row][col]);
			} System.out.println("\n");
		}
		
		
		
	}
}
