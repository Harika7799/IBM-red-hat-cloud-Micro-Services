package org.example.dao;

import java.util.List;

import java.util.Scanner;

import org.example.Hibernate_Employee.Employee;
import org.example.connection.MySessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Employee_D2  implements Employee_D{
	private MySessionFactory msf;
	private SessionFactory sf;
	private Session session;
	private static Scanner sc=new Scanner(System.in);
	{
		
			msf=MySessionFactory.createMySessionFactory();
			sf=msf.getSf();
			session =sf.openSession();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		session=sf.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}
	

	@Override
	public List<Employee> displayAllEmployee() {
		session=sf.openSession();
		Query query=session.createQuery("select E from Employee E");
		return query.getResultList();
	}

	@Override
	public Employee getemployeeById(Integer id) {
	
		session=sf.openSession();
		return session.get(Employee.class, id);
	}
	

	@Override
	public Employee updateEmployee(Integer id) {
		session =sf.openSession();
		Employee t_E =session.get(Employee.class, id);
		if(t_E == null)
		{
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		System.out.print("First Name: ");
		String first_Name=sc.next();
		System.out.print("Last Name: ");
		String last_Name=sc.next();
		System.out.print("Email: ");
		String email=sc.next();
		t_E.setFirstName(first_Name);
		t_E.setLastName(last_Name);
		t_E.setEmail(email);
		session.getTransaction().begin();
		session.merge(t_E);
		session.getTransaction().commit();
		return t_E;
	}

	@Override
	public void deleteEmployee(Integer id) {
		session =sf.openSession();
		Employee del =session.get(Employee.class, id);
		if(del == null) {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		session.getTransaction().begin();
		session.remove(del);
		session.getTransaction().commit();
	}

}
