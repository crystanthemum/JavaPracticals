package methodsPractical;

public class GetAverage {

	public static void main(String[] args) {
		getAverage(1, 1, 1);
	}
	/*
	 * this method will take three integers and calculate the average
	 */
	public static double getAverage(int num1, int num2, int num3) {
		double average = 0;
		int total = 0;
		
		total = num1+num2+num3;
		average =(double)total/3;
		System.out.println(average);
		return average;
	}
		
	}


