package arrayPractical;

public class Assignment {

	public static void main(String[] args) {

		int[] Assig1 = { 24, 42, 29, 66, 77 };
		int[] Assig2 = { 79, 68, 31, 22, 42 };

		getAvg(Assig1);
		getAvg(Assig2);
		assigAnalyser(Assig1, Assig2);
	}

	/**
	 * method to retrieve average mark
	 */

	public static void getAvg(int[] marks) {

		int totalMark = 0;

		for (int M : marks) {
			totalMark += M;
		}
		System.out.printf("Average :%.1f \n", (double) totalMark / marks.length);
	}

	public static void assigAnalyser(int[] Assig1, int[] Assig2) {

		// get the average

		int totalMark = 0;
		int totalMark2 = 0;
		
		int avg1 = 0;
		int avg2 = 0;
		
		for (int index = 0; index < Assig1.length; index++) {
			totalMark += Assig1[index];
			avg1 = totalMark/Assig1.length;
			
		}
		for (int index = 0; index < Assig2.length; index++) {
			totalMark2 += Assig2[index];
			avg2 = totalMark2/Assig2.length;
		}
		
		System.out.println(avg1 + avg2/2);

		if(avg1 > avg2) {
			System.out.println("Avg for assig 1 was higher");
		} else if (avg2 > avg1) {
			System.out.println("Avg for assig2 was higher");
		} else {
			System.out.println("Avgs for both assignment was the same");
		}
	}

}
