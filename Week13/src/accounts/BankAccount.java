package accounts;

public abstract class BankAccount {

	public BankAccount() {
	}
	
	private int accNumber;
	private double balance;
	/**
	 * @return the accNumber
	 */
	public int getAccNumber() {
		return accNumber;
	}
	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public void displayAll() {
		System.out.println("accNumber " + accNumber + ", Balance " + balance);
	}
	
	

}
