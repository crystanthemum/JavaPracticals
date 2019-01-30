package oops;
/*
 *  
 */
public class MessageCentre {
		
	
	public void displayWelcomeMessage (String timeOfDay) {
		String message = "hello";
		
		if (timeOfDay.equalsIgnoreCase("am")) {
			message+=" and good morning";
		} else if (timeOfDay.equalsIgnoreCase("pm")) {
			message+=" and good afternoon";
		} else {
			message+=" and good day";
		} 
		System.out.println(message);
	}
}
