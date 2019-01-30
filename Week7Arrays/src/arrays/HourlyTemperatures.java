package arrays;

public class HourlyTemperatures {

	public static void main(String[] args) {
		
		int[] hourlyTemps = {10,15,19,25};
		
		int[] heights = {124,145,120};
		
		showArray(hourlyTemps);
		showArray(heights);
	}
	
	public static void showArray(int[]anArray) {
		for (int loop = 0; loop <anArray.length; loop++) {
			System.out.println(anArray[loop]);
		}
	}

}
