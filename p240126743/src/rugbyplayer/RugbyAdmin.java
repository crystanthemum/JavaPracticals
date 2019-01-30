package rugbyplayer;

public class RugbyAdmin {

	public static void main(String[] args) {
		
		Forward p1 = new Forward("Paul O C", 39, 100, "Irish", 123);
		Forward p2 = new Forward("Richie McCaw", 37, 98, "NZ", 100);
		Back p3 = new Back("Brian O D", 39, 96, "Irish", 11.9);
		Back p4 = new Back("LeRoux", 22, 87, "USA", 10.9);
		
		// array of rugbyPlayer objects
		RugbyPlayer[] rugbyPlayers = {p1,p2, p3, p4};
		Back[] backPlayers = {p3, p4};
		
		showAllDetails(rugbyPlayers);
		showIrish(rugbyPlayers);
		modifySpeed(backPlayers);
		
	/**
	 * method to show all the details of each rugby player
	 */
	}
	public static void showAllDetails(RugbyPlayer[]rugbyPlayers) {
		for(RugbyPlayer player : rugbyPlayers) {
			System.out.println();
			player.showAll();
		}
	}
	
	/**
	 * method to show players who are Irish
	 */
	public static void showIrish(RugbyPlayer[]rugbyPlayers) {
		for(int index = 0; index < rugbyPlayers.length; index++) {
			if (rugbyPlayers[index].getNationality().equalsIgnoreCase("irish")) {
				System.out.println("Irish players : "+rugbyPlayers[index].getName());
			}
		}
	}
	
	/**
	 * method to update speed by -1
	 */
	
	public static void modifySpeed(Back[]backPlayers) {
		for(int loop = 0; loop <backPlayers.length; loop++)
		{
			backPlayers[loop].getMax100Speed();
			backPlayers[loop].setMax100Speed(backPlayers[loop].getMax100Speed()-1);   ;
			System.out.println(backPlayers[loop].getName()+" "+backPlayers[loop].getMax100Speed());
		}
		
		
	}
	
	
	
	

}
