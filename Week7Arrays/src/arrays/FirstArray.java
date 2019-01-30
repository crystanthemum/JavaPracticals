package arrays;
/*
 * 
 */
public class FirstArray {
	/*
 * 
 */
	public static void main(String[] args) {
		// 1. declare an array of ints
		//int would be the datatype of that array 
		int[] myArray;
		
		//2. initialize
		// '4' = the number of elements 
		myArray = new int[4];
		
		//once array is declared, if values are not assigned, each element value defaulted: '0'
		// if objects are in the array, default value = 'null'
		
		//3. giving the array values
		myArray[0] = 8;
		myArray[1] = 8;
		myArray[2] = 10;
		myArray[3] = 9;
		
		/*
		System.out.println(myArray[0]);			this is too repetitive
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		*/
		
		// if a value needs to changed
		
		myArray[3] = 10;
		// the value at index 3 will be changed to '10'
		
		//4. printing with a loop instead
		// using loops with arrays, good to start with 0
		for (int loop = 0; loop <4; loop++) {
			System.out.println(myArray[loop]);
			
		/*NOTE: if 'loop <5' = created an index OUT OF BOUNDS, the array only
		 * has 4 elements
		 */
			
		// instead of 'loop<4', easier to have 'loop<myArray.length;
		}
		
		
	}

}
