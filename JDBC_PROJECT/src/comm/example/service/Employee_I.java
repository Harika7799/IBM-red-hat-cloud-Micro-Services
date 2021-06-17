package comm.example.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.connection2.EmployeeDao;
import comm.example.connection2.Employee_D;
import comm.example.jdbc.Employee_J;

public class Employee_I implements Employee_S {
	
	private EmployeeDao E;
	
	public Employee_I() throws SQLException {
		E = new Employee_D();
	}

	@Override
	public Employee_J createEmployee(Employee_J employee) throws SQLException {
		
		return null;
	}

	@Override
	public List<Employee_J> getAllEmployees() throws SQLException {
	
		return E.getAllEmployees();
	}

}
