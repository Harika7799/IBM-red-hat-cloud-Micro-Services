package comm.example.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import comm.example.connection2.EmployeeNotFoundException;
import comm.example.jdbc.Employee_J;

public interface Employee_S {
	public Employee_J createEmployee(Employee_J employee) throws SQLException;
	public List<Employee_J> getAllEmployees()throws SQLException;
	public List<Employee_J> findById(Integer Id)throws SQLException;
	public Employee_J updateEmployee(Integer Id)throws SQLException;
	public ResultSet searchE_Id(int searchId)throws SQLException;
	public List<Employee_J> deleteEmployee(Integer Id)throws SQLException,EmployeeNotFoundException;

	
	

}
