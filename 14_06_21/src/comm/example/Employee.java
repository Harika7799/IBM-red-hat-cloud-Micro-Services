package comm.example;

public class Employee implements Comparable {
    private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	
	
	public Employee() {
		super();
	}
	public Employee(String employeeId, String firstName, String lastName, String email, double salary)
	{
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		if((this.salary >((Employee) o).salary))
		return -1;
		else if ((this.salary >((Employee) o).salary))
			return 1;
		return 0;

	}
	
}
	
		

	



