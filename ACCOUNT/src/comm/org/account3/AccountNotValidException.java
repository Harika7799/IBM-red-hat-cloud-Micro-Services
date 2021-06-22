package comm.org.account3;

public class AccountNotValidException extends Exception {
	
	private String Message;
	public AccountNotValidException(String message) {
		super();
		Message = message;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}


}
