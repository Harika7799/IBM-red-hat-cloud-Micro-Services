package com.example.DTO;

import java.util.List;

import com.example.RESPONSE.EmployeeResponseModel;

public class Employee_DT {
	
	private String Employee_Id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	
	public Employee_DT() {
		super();
	}
	public Employee_DT(String employee_Id, String first_Name, String last_Name, String email) {
		super();
		this.Employee_Id = employee_Id;
		this.First_Name = first_Name;
		this.Last_Name = last_Name;
		this.Email = email;
	}
	public String getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(String employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Employee_DT [Employee_Id=" + Employee_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Email=" + Email + "]";
	}
	public EmployeeResponseModel createEmployee(Employee_DT dto) {
		
		return null;
	}
	public List<EmployeeResponseModel> DisplayAllEmployee() {
		
		return null;
	}
	public EmployeeResponseModel FindBy_Id(String employee_Id2) {
		
		return null;
	}
	public EmployeeResponseModel UpdateEmployee(String employee_Id2) {
		
		return null;
	}
	public void DeleteEmployee(String employee_Id2) {
		
		
	}
	
	


}
