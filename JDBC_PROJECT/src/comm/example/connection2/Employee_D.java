package comm.example.connection2;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		
		//list=new ArrayList<Employee_J>();
		mcf=MyConnectionFactory.createFactory();
		conn=mcf.getMyConnection();
	}
	
	public Employee_J createEmployee_J(Employee_J e)throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into employee(id,First_Name,Last_Name,email) values(?,?,?,?)");
		ps.setInt(1, e.getId());
		ps.setString(2, e.getFirstName());
		ps.setString(3, e.getLastName());
		ps.setString(4, e.getEmail());
		int result =ps.executeUpdate();
		System.out.println(result +"rows added");
		return e;

}

	public List<Employee_J> getAllEmployees() throws SQLException{
		list=new ArrayList<Employee_J>();
		Statement statement=conn.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee");
		while(resultSet.next()) {
			list.add(new Employee_J(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
		}
		return list;
	}

	@Override
	public List<Employee_J> findById(Integer id) throws SQLException {
		list =new ArrayList<Employee_J>();
		PreparedStatement ps =conn.prepareStatement("select * from employee WHERE id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			list.add(new Employee_J(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));	
		}
		return list;
	}
}
		


