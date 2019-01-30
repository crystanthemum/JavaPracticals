package accounts;

public class ATM {

	public ATM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		BusinessAccount a1 = new BusinessAccount();
		a1.setAccNumber(40126843);
		a1.setBalance(21.00);
		a1.displayAll();
		a1.printStatment();
		
		System.out.println(a1.getAccNumber() + a1.getBalance());
		
	}

}
