package com.example.Dao;

import java.io.IOException;
import java.util.List;

import com.example.DTO.Employee_DT;
import com.example.Employee.Employee;
import com.example.RESPONSE.EmployeeResponseModel;

public interface Employee_D1 {
	public EmployeeResponseModel createEmployee(Employee_DT employeeDetails);
	public List<EmployeeResponseModel> DisplayAllEmployee();
	public EmployeeResponseModel FindBy_Id(String Employee_Id);
	public EmployeeResponseModel UpdateEmployee(String Employee_Id)throws IOException;
	public void  DeleteEmployee(String Employee_Id);
	

}
