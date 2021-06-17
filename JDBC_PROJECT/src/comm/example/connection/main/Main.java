package comm.example.connection.main;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import comm.example.connection2.EmployeeDao;
import comm.example.connection2.Employee_D;
import comm.example.jdbc.Employee_J;
import comm.example.service.Employee_I;
import comm.example.service.Employee_S;


public class Main {

	public static void main(String[] args)throws SQLException {
		//EmployeeDao E =new Employee_D();
		Employee_S service=new Employee_I();
		//List<Employee_J> e =E.getAllEmployees();
		List<Employee_J> e=service.getAllEmployees();
		Iterator<Employee_J> i =e.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}
}
