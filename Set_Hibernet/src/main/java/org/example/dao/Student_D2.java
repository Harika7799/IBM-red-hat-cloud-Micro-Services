package org.example.dao;

import java.util.List;
import java.util.Scanner;

import org.example.connection.MySessionFactory;
import org.example.set.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Student_D2 implements Student_D {
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
	public Student createStudent(Student Stu) {
		
		session=sf.openSession();
		session.getTransaction().begin();
		session.save(Stu);
		session.getTransaction().commit();
		return Stu;
	
	}

	@Override
	public List<Student> displayAllStudent() {
		session=sf.openSession();
		Query query=session.createQuery("select E from Employee E");
		return query.getResultList();
	}

	@Override
	public Student getStudentById(Integer id) {
	
		session=sf.openSession();
		return session.get(Student.class, id);
	}

	@Override
	public Student updateStudent(Integer id) {
		
		session =sf.openSession();
		Student t_E =session.get(Student.class, id);
		if(t_E == null)
		{
			throw new StudentNotFoundException("Student Not Found");
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
	public void deleteStudent(Integer id) {
		session =sf.openSession();
		Student del =session.get(Student.class, id);
		if(del == null) {
			throw new StudentNotFoundException("Student Not Found");
		}
		session.getTransaction().begin();
		session.remove(del);
		session.getTransaction().commit();
	}
		
	}

	
