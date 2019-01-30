package arrays;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] shoeSize = new int[9];
		shoeSize[0] = 9; //however can use array initialiser to shorten code
		shoeSize[1] = 3; //int[] shoeSize = { 2,5,4};
 		
		System.out.println(shoeSize[0]);
		
		for (int loop = 0; loop<shoeSize.length; loop++) {
			System.out.println(shoeSize[loop]);
		}
		

	}

}
