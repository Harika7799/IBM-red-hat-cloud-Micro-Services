package org.example.hibernate.demo.h;

import java.util.Random;

import org.example.hibernate.demo.Hibernate_O.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
            SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
            Session session=factory.openSession();
            session.getTransaction().begin();
            session.save(new Employee(new Random().nextInt(), "Daniel", "Mark", "daniel@email.com"));
            session.getTransaction().commit();
            System.out.println("one item saved");
    			
    		} catch (Exception e) {
    			// TODO: handle exception
    			e.printStackTrace();
    		}
    }
}
