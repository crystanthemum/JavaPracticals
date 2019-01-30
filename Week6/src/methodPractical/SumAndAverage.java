package methodPractical;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSumAndAvg(10);
	}
	public static void getSumAndAvg(int upperBound) {
		
		int total = 0;
		double average =  0;
		
		for (int loop = 1; loop<upperBound; loop++) {
			total += loop; //total = total + loop
		}
		
		System.out.println("Total is : "+total);
		average = total/upperBound;
		System.out.println("The average of the total is "+average);
		
			
		}
		
	}
