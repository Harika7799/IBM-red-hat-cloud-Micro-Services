package org.example.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.example.Employee.Employee;
import org.springframework.stereotype.Component;

@Component
public class Employee_D2 implements Employee_D1 {
	
	private DataSource data;
	
	public Employee_D2(DataSource data) {
		super();
		this.data = data;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		try {
			Connection connection=data.getConnection();
			PreparedStatement ps=connection.prepareStatement("insert into employee(id,first_name,last_name,email) values(?,?,?,?)");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getFirstName());
			ps.setString(3, employee.getLastName());
			ps.setString(4, employee.getEmail());
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public List<Employee> displayEmployees() {
		
		return null;
	}

}
