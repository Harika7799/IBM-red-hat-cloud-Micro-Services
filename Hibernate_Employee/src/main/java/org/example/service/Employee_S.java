package org.example.service;

import java.util.List;

import org.example.Hibernate_Employee.Employee;

public interface Employee_S {
	public Employee createEmployee(Employee employee);
	public List<Employee> displayAllEmployee();
	public Employee getemployeeById(Integer id);
	public Employee updateEmployee(Integer id);
	public void deleteEmployee(Integer id);

}
