package org.example.Mapping;

import org.example.instructor.STUDENT;
import org.example.instructor.UNIVERSITY;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(STUDENT.class).addAnnotatedClass(UNIVERSITY.class)
			.buildSessionFactory();
	Session session = sf.getCurrentSession();

}
}
