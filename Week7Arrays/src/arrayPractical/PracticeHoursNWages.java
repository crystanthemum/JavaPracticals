package arrayPractical;

public class PracticeHoursNWages {
	/*
	 * this array will store the day of the week and hours worked per day 
	 */
	public static void main(String[] args) {
		//declare the constant
		final double Rate = 11.25;
		double totalHrs = 0;
		
		int[] HrsPerDay = {8,7,9,7,4};
		String[]DOTW = {"Monday","Tuesday", "Wednesday","Thursday","Friday"};
		
		for(int day = 0; day<DOTW.length; day++) {
			System.out.println(DOTW[day]);
		}
		for(int index =0; index<HrsPerDay.length; index++) {
			System.out.print(HrsPerDay[index]+" hours \n");
		totalHrs+=HrsPerDay[index];	
		
		}
		System.out.println("Total hours worked this week: "+ totalHrs);
		System.out.println("This week's pay :"+totalHrs* Rate);
		
	}
	
	

}
