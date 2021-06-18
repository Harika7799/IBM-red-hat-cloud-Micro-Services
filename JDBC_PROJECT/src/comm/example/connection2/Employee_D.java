package comm.example.connection2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import comm.example.connection.MyConnectionFactory;
import comm.example.jdbc.Employee_J;


public class Employee_D implements EmployeeDao{
	private List<Employee_J> list;
	private MyConnectionFactory mcf;
	private Connection conn;
	private static Scanner sc = new Scanner(System.in);
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

	@Override
	public Employee_J updateEmployee(Integer Id) throws SQLException, EmployeeNotFoundException {
		List<Employee_J> employees = findById(Id);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException("employee not found with id: " + Id);
		}
		System.out.println("enter new first name: ");
		String firstName = sc.next();
		System.out.println("enter new last name: ");
		String lastName = sc.next();
		System.out.println("enter new email: ");
		String email = sc.next();

		PreparedStatement ps = conn.prepareStatement("update employee set first_name=?,last_name=?,email=? where id=?");
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, email);
		ps.setInt(4, Id);
		ps.executeUpdate();
		System.out.println("updation sucessfull!");
		Employee_J employee = employees.get(0);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		return employee;
	}

	@Override
	public List<Employee_J> deleteEmployee(Integer Id) throws SQLException, EmployeeNotFoundException {
		ResultSet list = searchE_Id(Id);
		List<Employee_J> list1 =new ArrayList<Employee_J>();
		while(list.next()) {
			list1.add(new Employee_J(list.getInt(1),list.getString(2),list.getString(3),list.getString(4)));
		return null;
	}
		if(list1.isEmpty()) {
			throw new EmployeeNotFoundException("Employee not found "+ Id);
		}
		PreparedStatement ps =conn.prepareStatement("Delete from Employee wehre employee_Id");
		ps.setInt(1, Id);
		ps.executeUpdate();
	System.out.println("Deleted Succesfully..");
	return list1;
		}

	@Override
	public ResultSet searchE_Id(int searchId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
		


