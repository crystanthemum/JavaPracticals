/**
 * 
 */
package interfaces;

/**
 * @author User
 *
 */
public class Surgeon extends Employee implements IAdministerDrugs {
	
	//instance vars
	private String specialistArea;
	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	private double consultationFee;
	
	/* (non-Javadoc)
	 * @see interfaces.Employee#calculateWeeklySalary(double)
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		// TODO Auto-generated method stub
		super.calculateWeeklySalary(hours * this.getBaseRate() + this.getConsultationFee());
	}

	/* (non-Javadoc)
	 * @see interfaces.Employee#printAll()
	 */
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
		System.out.println("Surgeon : admin controlled drug : false");
		System.out.println("Surgeon : admin noncontrolled drug : true");
		
				
	}

	/**
	 * default constructor
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, boolean adminControlledDrug, boolean adminNonControlledDrug,
			 String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.adminControlledDrug();
		this.adminNonControlledDrug();
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
		
	}
	
	

	@Override
	public boolean adminControlledDrug() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminNonControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}

}
