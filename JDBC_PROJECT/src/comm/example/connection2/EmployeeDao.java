package comm.example.connection2;
import java.sql.SQLException;
import comm.example.jdbc.Employee_J;
import java.util.List;

import comm.example.jdbc.Employee_J;
public interface EmployeeDao {

	public Employee_J createEmployee_J(Employee_J e)throws SQLException;

	
		public List<Employee_J>getAllEmployees() throws SQLException;
		
		
	}


