package comm.org.account;

public enum A_Type {
	
	SAVINGS("Savings Account"),CREDIT_CARD("Credit card Account"),LOAN("Loan Account"),CURRENT("Current Account");
	private String message;
	private A_Type(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
