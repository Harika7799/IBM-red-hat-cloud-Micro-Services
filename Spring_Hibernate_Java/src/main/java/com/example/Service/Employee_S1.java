package com.example.Service;

import java.util.List;

import com.example.RESPONSE.EmployeeRequestModel;
import com.example.RESPONSE.EmployeeResponseModel;

public interface Employee_S1 {
	public EmployeeResponseModel createEmployee(EmployeeRequestModel employeeDetails);
	public List<EmployeeResponseModel> DisplayAllEmployee();
	public EmployeeResponseModel FindBy_Id(String Employee_Id);
	public EmployeeResponseModel UpdateEmployee(String Employee_Id);
	public void  DeleteEmployee(String Employee_Id);


}
