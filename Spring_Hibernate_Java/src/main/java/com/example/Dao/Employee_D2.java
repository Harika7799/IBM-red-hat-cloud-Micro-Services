package com.example.Dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.example.Spring_Hibernate_Java.EmployeeNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.DTO.Employee_DT;
import com.example.Employee.Employee;
import com.example.RESPONSE.EmployeeResponseModel;

public class Employee_D2 implements Employee_D1 {
	private static Scanner sc =new Scanner(System.in);
	private SessionFactory sessionFactory;
	private ModelMapper modelMapper;
	
	@Autowired
	public Employee_D2(SessionFactory sessionFactory, ModelMapper modelMapper) {
		super();
		this.sessionFactory = sessionFactory;
		this.modelMapper = modelMapper;
	}
	
	@Override
	@Transactional
	public EmployeeResponseModel createEmployee(Employee_DT employeeDetails) {
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			Employee employee = modelMapper.map(employeeDetails, Employee.class);
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.getTransaction().begin();
			currentSession.persist(employee);
			currentSession.getTransaction().commit();
			EmployeeResponseModel model = modelMapper.map(employee, EmployeeResponseModel.class);
			return model;
		}

	@Override
	public List<EmployeeResponseModel> DisplayAllEmployee() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session current_S =sessionFactory.openSession();
		Query qu =current_S.createQuery("Select id from Employee", EmployeeResponseModel.class);
		@SuppressWarnings("unchecked")
		List<Employee> list=qu.getResultList();
		Iterator<Employee> i=list.iterator();
		List<EmployeeResponseModel> list1=new ArrayList<EmployeeResponseModel>();
		while(i.hasNext())
		{
			list1.add(modelMapper.map(i.next(), EmployeeResponseModel.class));		}
		return list1;
	}


	@Override
	public EmployeeResponseModel FindBy_Id(String Employee_Id) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session currentSession = sessionFactory.openSession();
		Query query=currentSession.createQuery("SELECT E FROM Employee E WHERE E.employeeId=:empId").setString("empId", Employee_Id);
		List<Employee> list=query.getResultList();
		if(list.isEmpty())
		{
		return null;
	     }
		else
		{
			Iterator<Employee> i=list.iterator();
			List<EmployeeResponseModel> list1=new ArrayList<EmployeeResponseModel>();
			while(i.hasNext())
			{
				list1.add(modelMapper.map(i.next(), EmployeeResponseModel.class));		
			}
			EmployeeResponseModel model=list1.get(0);
			
			return model;
		}
	}
	@Override
	public EmployeeResponseModel UpdateEmployee(String Employee_Id) throws IOException {
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session currentSession = sessionFactory.openSession();
		Query query=currentSession.createQuery("SELECT E FROM Employee E WHERE E.employeeId=:empId").setString("empId", Employee_Id);
		List<Employee> list=query.getResultList();
		Employee emp =list.get(0);
		if(emp==null)
		{
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		System.out.print("First Name");
		String First_Name =sc.next();
		System.out.print("Last Name");
		String Last_Name =sc.next();
		System.out.print("Email");
		String Email =sc.next();
		emp.setFirst_Name(First_Name);
		emp.setLast_Name(Last_Name);
		emp.setEmail(Email);
		currentSession.merge(emp);
		EmployeeResponseModel model = modelMapper.map(emp, EmployeeResponseModel.class);
		return model;
	}

	@Override
	public void DeleteEmployee(String Employee_Id) {
		Session currentSession = sessionFactory.openSession();
		Query query=currentSession.createQuery("SELECT E FROM Employee E WHERE E.employeeId=:empId").setString("empId", Employee_Id);
		List<Employee> list=query.getResultList();
		Employee emp=list.get(0);
		currentSession.remove(emp);
		System.out.print("Removed succesfully..");
		}

	
	
	
	}


