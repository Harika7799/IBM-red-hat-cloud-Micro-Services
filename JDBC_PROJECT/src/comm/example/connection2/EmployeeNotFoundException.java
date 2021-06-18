package comm.example.connection2;

public class EmployeeNotFoundException extends Exception{
	private String Message;
	public EmployeeNotFoundException(String message) {
		super();
		this.Message = message;
	}
	public String getMessage() {
		return Message;
	}
	
	

}
