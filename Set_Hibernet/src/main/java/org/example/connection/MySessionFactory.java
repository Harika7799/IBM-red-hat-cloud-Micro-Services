package org.example.connection;

import java.util.Properties;
import org.example.set.Student;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class MySessionFactory {

	private static MySessionFactory msf;
	private SessionFactory sf;
	private Properties p= null;
	private MySessionFactory() {
		p=new Properties();
		p.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.put("hibernate.connection.password", "root");
		p.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/hr");
		p.put("hibernate.connection.username","root");
		p.put("hibernate.default_schema", "hr");
	  //p.put("hibernate.current_session_context_class", "thread");

	}
	public static MySessionFactory createMySessionFactory() {
		if (msf == null) {
			msf = new MySessionFactory();
		}
		return msf;
	}
	public SessionFactory getSf() {
		sf=new Configuration().addProperties(p).addAnnotatedClass(Student.class).buildSessionFactory();
		return sf;
	}
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
}
