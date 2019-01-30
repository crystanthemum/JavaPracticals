package objectOrientatedProgramming;

public class TeamAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Footballers f1 = new Footballers();
		f1.setfName("David");
		f1.setlName("Beckham");
		f1.setSquadNumber(7);
		f1.setEmployeeNumber(123456);
		
		/*
		System.out.println(f1.getfName());
		System.out.println(f1.getlName());
		System.out.println("Squad Number : " + f1.getSquadNumber());
		System.out.println("Employee Number : " + f1.getEmployeeNumber());
		*/
		
		System.out.println(f1.toString()); //shortcut for above
		
		Footballers f2 = new Footballers("leo", "messi", 10,4584 );
		System.out.println(f2.toString());
	}

}
