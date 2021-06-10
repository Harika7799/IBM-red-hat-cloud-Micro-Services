package comm.example;
public class Employee1 {
private Integer EmployeeId;
private String FirstName;
private String LastName;
private String Email;
private EmployeeType employeeType;
public static int max=10;

public Employee1() {
	// TODO Auto-generated constructor stub
	super();
}
public Employee1(Integer EmployeeId, String FirstName, String LastName, String Email,EmployeeType employeeType) {
		super();
		this.EmployeeId = EmployeeId;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.employeeType = employeeType;
	}
public Integer getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(Integer employeeId) {
	EmployeeId = employeeId;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return "Employee1 [EmployeeId=" + EmployeeId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
			+ Email + ", employeeType=" + employeeType + "]";
}
	



	
}


