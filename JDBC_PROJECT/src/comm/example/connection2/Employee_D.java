package comm.example.connection2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.connection.MyConnectionFactory;
import comm.example.jdbc.Employee_J;

public class Employee_D implements EmployeeDao{
	private List<Employee_J> list;
	private MyConnectionFactory mcf;
	private Connection conn;
	
	public Employee_D() throws SQLException 
	{
		
		list=new ArrayList<Employee_J>();
		mcf=MyConnectionFactory.createFactory();
		conn=mcf.getMyConnection();
	}
	
	public Employee_J createEmployee_J(Employee_J e)throws SQLException {
		
		return null;

}

	public List<Employee_J> getAllEmployees() throws SQLException{
		
		Statement statement=conn.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee");
		while(resultSet.next()) {
			list.add(new Employee_J(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
		}
		return list;
	}
}
		


