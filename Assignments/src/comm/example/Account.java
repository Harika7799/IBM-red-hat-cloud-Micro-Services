package comm.example;

public abstract class Account extends Customer {

	protected int AccountNumber;
	protected Customer customerObj;
	protected double balance;
	public Account() {
		super();
	}
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		AccountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomerObj() {
		return customerObj;
	}
	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}
	public abstract boolean WithDraw(double amount);
	
}