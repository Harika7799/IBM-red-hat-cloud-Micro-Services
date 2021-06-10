package comm.example;

public class Manager1 extends Employee1{
	private String departmentName;
	
	
	public Manager1() 
	{
		super();
		
	}

	public Manager1(Integer EmployeeId, String FirstName, String LastName, String Email,EmployeeType employeeType,String departmentName) {
		super(EmployeeId, FirstName, LastName, Email, employeeType);
		this.departmentName =departmentName;
		
		
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Manager1 [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}

	
	

}
