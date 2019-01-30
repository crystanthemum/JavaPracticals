package accounts;

public class BusinessAccount extends BankAccount implements IPrintable {

	public BusinessAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printStatment() {
		 System.out.println("A printed statement will be sent to your address");

	}
	
	public void displayAll() {
		
	}

}
