package twoDArrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create the 2D array with 3 rows, 4 columns
		//int[][] my2D = new int[3][4];
		//creating an array with an initialiser
		int[][] my2D = {{2,3,4},{5,7,9},{100,11,14,12,13,14}};
		
		//NOTE: jagged array is an array with some incomplete columns
		// 2. set some values
	
		my2D[0][0] = 999;
		// my2D[2][3] = 999;
		
		// output to screen all values. one loop goes through the row, one loop goes through column
		for (int row = 0; row <my2D.length; row++) {   		//row loop . <my2D.length shows no. of rows
			for (int col= 0; col<my2D[row].length; col++) {			//column loop
				System.out.print(my2D[row][col]+"\t");
			}
			System.out.println();
		}
		
	}

}
