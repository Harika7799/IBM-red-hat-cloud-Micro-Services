package org.example.service;

import java.util.List;

import org.example.Hibernate_Employee.Employee;
import org.example.dao.Employee_D;
import org.example.dao.Employee_D2;

public class Employee_I implements Employee_S  {
	private Employee_D  E1;
	{
		E1 =new Employee_D2();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return E1.createEmployee(employee);
	}

	@Override
	public List<Employee> displayAllEmployee() {
		
		return E1.displayAllEmployee();
	}

	@Override
	public Employee getemployeeById(Integer id) {
	
		return E1.getemployeeById(id);
		
	}

	@Override
	public Employee updateEmployee(Integer id) {
		
		return E1.updateEmployee(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		
		E1.deleteEmployee(id);
	}

}
