package arrays;

import java.util.Arrays;

public class EnhancedForLoop { //aka FOR EACH loop

	public static void main(String[] args) {
		
		int[] children = {2,6,0,1,4,7};
		
		for (int loop = 0; loop<children.length; loop++) {
			System.out.println(children[loop]);
		}
		//for each loop means for each element in this loop. creating a var for each element in the array 
		//for each number of child in the children loop
		System.out.println("____for each loop ___");
		for (int childNumber : children) {
			System.out.println(childNumber);
			
		}
		//Arrays = a class (also an object), with static methods triggered by .
		System.out.println(Arrays.toString(children));
		
		//sorting the children array
		System.out.println("Sorting the children array");
		Arrays.sort(children);
		System.out.println(Arrays.toString(children));
		
	}

}
