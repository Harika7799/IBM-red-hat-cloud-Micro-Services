package comm.example.connection2;
import java.sql.ResultSet;
import java.sql.SQLException;
import comm.example.jdbc.Employee_J;
import java.util.List;

import comm.example.jdbc.Employee_J;
public interface EmployeeDao {

	public Employee_J createEmployee_J(Employee_J e)throws SQLException;

	
		public List<Employee_J>getAllEmployees() throws SQLException;
		public List<Employee_J> findById(Integer Id)throws SQLException;
		public ResultSet searchE_Id(int searchId)throws SQLException;
		public Employee_J updateEmployee(Integer Id)throws SQLException,EmployeeNotFoundException;
		public List<Employee_J> deleteEmployee(Integer Id)throws SQLException,EmployeeNotFoundException;


}


