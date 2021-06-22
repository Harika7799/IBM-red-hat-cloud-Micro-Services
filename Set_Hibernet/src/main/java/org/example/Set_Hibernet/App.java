package org.example.Set_Hibernet;

import java.util.Set;
import java.util.logging.Logger;

import org.example.set.Status;
import org.example.set.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
	private static Logger logger = Logger.getLogger("org.example.demo.App.class");
    public static void main( String[] args )
    {
    	try {
    		
			SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			Session session=sf.getCurrentSession();
			Student student=new Student();
			student.setFirstName("John");
			student.setLastName("Doe");
			student.setEmail("john@email.com");
			student.setStatus(Status.INACTIVE);
			Set<String> set=student.getImages();
			set.add("image-1");
			set.add("image-1");
			set.add("image-3");
			student.setImages(set);
			session.getTransaction().begin();
			session.save(student);
			session.getTransaction().commit();
			System.out.println("done");
			logger.info("done");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
			
    }

