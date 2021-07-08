package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(Integer id);
	public Employee getByEmployeeId(String id);
	public List<Employee> getByFirstName(String firstName);
	public List<Employee> getByLastName(String lastName);
	public Employee updateEmployeeByEmployeeId(String employeeId,Employee employee);
	public String deleteByEmployeeId(String EmployeeId);

}
