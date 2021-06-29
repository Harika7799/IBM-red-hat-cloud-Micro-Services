package com.example.Service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.Employee_DT;
import com.example.RESPONSE.EmployeeRequestModel;
import com.example.RESPONSE.EmployeeResponseModel;
@Service
public class Employee_S2 implements Employee_S1 {
	
	private Employee_DT employeeDaoImpl;
	private ModelMapper modelMapper;
	
	@Autowired
	public Employee_S2(Employee_DT employeeDaoImpl, ModelMapper modelMapper) {
		this.employeeDaoImpl = employeeDaoImpl;
		this.modelMapper = modelMapper;
	}

	@Override
	public EmployeeResponseModel createEmployee(EmployeeRequestModel employeeDetails) {
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Employee_DT dto=modelMapper.map(employeeDetails, Employee_DT.class);
		dto.setEmployee_Id(UUID.randomUUID().toString());
		return employeeDaoImpl.createEmployee(dto);
	}
	

	@Override
	public List<EmployeeResponseModel> DisplayAllEmployee() {
		
		return employeeDaoImpl.DisplayAllEmployee();
	}

	@Override
	public EmployeeResponseModel FindBy_Id(String Employee_Id) {
		
		return employeeDaoImpl.FindBy_Id(Employee_Id);
	}

	@Override
	public EmployeeResponseModel UpdateEmployee(String Employee_Id) {
		
		return employeeDaoImpl.UpdateEmployee(Employee_Id);
	}

	@Override
	public void DeleteEmployee(String Employee_Id) {
		employeeDaoImpl.DeleteEmployee(Employee_Id);
		
	}

	

}
