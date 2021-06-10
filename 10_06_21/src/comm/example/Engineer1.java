package comm.example;

public class Engineer1 extends Employee1 {
	private String Stream;

	public Engineer1() {
		super();
		
	}

	public Engineer1(Integer EmployeeId, String FirstName, String LastName, String Email,EmployeeType employeeType,String Stream) {
		super(EmployeeId, FirstName, LastName, Email, employeeType);
		this.Stream=Stream;
	
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Engineer1 [Stream=" + Stream + ", toString()=" + super.toString() + "]";
	}
	
	

}
