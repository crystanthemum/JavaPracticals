package arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] my2DArray = new int[3][4];

		int num = 2;
		int total = 0;
		for (int rowCounter = 0; rowCounter < my2DArray.length; rowCounter++) {
			for (int colCounter = 0; colCounter < my2DArray.length; colCounter++) {

				my2DArray[rowCounter][colCounter] = num;
				num += 2;
				System.out.printf("[%d][%d]:%d, ", rowCounter, colCounter, my2DArray[rowCounter][colCounter]);
			}
			System.out.println("\n");
			total += num;
		}
		
		System.out.println("total of the array : " + total);
		System.out.println("Average number of the array : " + total / my2DArray.length);
		
		
	}

}
