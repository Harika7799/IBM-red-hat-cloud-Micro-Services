package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
@Repository
@EnableTransactionManagement
public class EmployeeDaoImpl implements EmployeeDao {

private EntityManager entityManager;
	

	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
	
		Query query=entityManager.createQuery("SELECT E FROM Employee E",Employee.class);
		
		return query.getResultList();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(Integer id)
	{
		Employee emp= entityManager.find(Employee.class, id);
		if(emp==null)
		{
			throw new EmployeeNotFoundException("Employee with the given id not found.");
		}
		return emp;
	}

	@Override
	public Employee getByEmployeeId(String id) {
		Query query=entityManager.createQuery("SELECT E FROM Employee E WHERE B.employeeId=:eId",Employee.class);
		query.setParameter("bId", id);
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		if(list.isEmpty())
		{
			throw new EmployeeNotFoundException("Employee with the given employee_id not found.");
		}
		return list.get(0);
	}

	@Override
	@Transactional
	public Employee updateEmployeeByEmployeeId(String employeeId, Employee employee) {
		
		Employee emp1=getByEmployeeId(employeeId);
		emp1.setFirstName(employee.getFirstName());
		emp1.setLastName(employee.getLastName());
		emp1.setEmail(employee.getEmail());
		emp1.setIsActive(employee.getIsActive());
		entityManager.merge(emp1);
		return emp1;
	}

	@Override
	@Transactional
	public String deleteByEmployeeId(String employeeId) {
		Employee E=getByEmployeeId(employeeId);
		entityManager.remove(E);
		return "deleted sucessfully";
	}

	@Override
	public List<Employee> getByFirstName(String firstName) {
		Query query=entityManager.createQuery("SELECT E FROM Employee E.firstName =:fName",Employee.class);
		query.setParameter("fName", firstName);
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		if(list.isEmpty())
		{
			throw new EmployeeNotFoundException("Employee with the given employee_id not found.");
		}
		
		return list;
	}

	@Override
	public List<Employee> getByLastName(String lastName) {
		Query query=entityManager.createQuery("SELECT E FROM Employee E.lastName =:lName",Employee.class);
		query.setParameter("lName", lastName);
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		if(list.isEmpty())
		{
			throw new EmployeeNotFoundException("Employee with the given employee_id not found.");
		}
		
		
		return list;
	}

}
