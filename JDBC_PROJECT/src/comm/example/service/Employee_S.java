package comm.example.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.jdbc.Employee_J;

public interface Employee_S {
	public Employee_J createEmployee(Employee_J employee) throws SQLException;
	public List<Employee_J> getAllEmployees()throws SQLException;
	public List<Employee_J> findById(Integer id)throws SQLException;

	
	

}
