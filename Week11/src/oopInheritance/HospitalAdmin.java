package oopInheritance;

public class HospitalAdmin extends StaffMember {
	/*
	 * Class will hold staff members
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaffMember sm1 = new StaffMember();
		sm1.setFirstName("John");
		sm1.setLastName("Doe");
		System.out.println(sm1.toString());
		
		//creating a staff member with the constructor with arguments
		StaffMember sm2 =  new StaffMember("Jane", "Doe");
		System.out.println(sm2.toString());
		
		
		Doctor dr1 = new Doctor();
		dr1.setWard(2);
		dr1.setFirstName("Doctor");
		dr1.setLastName("Who");
		System.out.println(dr1.toString());
		
		Doctor dr2 = new Doctor("Dr", "Watson", 23);
		System.out.println(dr2.toString());
		
		Programmer pg1 = new Programmer();
		pg1.setFirstName("Crystal");
		pg1.setLastName("Fong");
		pg1.setLanguage("Java");
		System.out.println(pg1.toString());
		
		Programmer pg2 = new Programmer("Ciaran", "Mulholland", "C");
		System.out.println(pg2.toString());
		
		
	}
		
}
