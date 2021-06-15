package comm.example.list;
import java.util.List;

public class List_E {

	public static void printEmployees(List<Employee>employeeList) {
		System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n","EmpId","Name","Department","DOJ","Age","Salary");
	for(Employee e:employeeList)
		System.out.println(e);
	
	}
}
