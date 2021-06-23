package org.example.Mapping;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.example.instructor.Course;
import org.example.instructor.Instructor;
import org.example.instructor.InstructorDetails;
import org.example.instructor.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = Logger.getLogger("org.example.demo.App.class");
    	try {
     	   
     	   SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).
     			   addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).addAnnotatedClass(People.class).buildSessionFactory();
     	   Session session= sf.getCurrentSession();
 		
 			Instructor instructor=new Instructor();
 			InstructorDetails details=new InstructorDetails();
 			details.setHobby("Singing");
 			details.setYoutubeChannel("channel-1");
 			instructor.setFirstName("John");
 			instructor.setLastName("Doe");
 			instructor.setEmail("john@email.com");
 			instructor.setInstructorDetails(details); 
 			session.getTransaction().begin();
 			session.persist(instructor);
 			session.getTransaction().commit();
 		    session.getTransaction().begin();
 		    
 		    Course course =new Course();
 		    course.setC_Name("Honey");
 		    instructor.add(course);
 		    Course course1 = new Course();
 		    course1.setC_Name("well");
 		    instructor.add(course1);
 		   // session.persist(instructor);
 		   // session.getTransaction().commit();
 		    People p1 =new People();
 		    p1.setFirstName("L1");
 		    p1.setLastname("p2");
 		    p1.setEmail("rrr");
 		    session.persist(instructor);
 		   List<Course> list = new ArrayList<Course>();
			list.add(course);
			list.add(course1);
			p1.setCourses(list);
			session.persist(p1);
			session.getTransaction().commit();
 		     
     	   /*Instructor instructor1=session.get(Instructor.class, 1);
 		   InstructorDetails details1=instructor.getInstructorDetails();
 			 details.setHobby("Cricket"); 
 			 details.setYoutubeChannel("my-channel-1");
 			 instructor.setEmail("john1@email.com");
 			 session.merge(instructor);
 			 session.getTransaction().commit();
 			 session.delete(instructor);
     	     session.getTransaction().commit();
     	     System.out.println("done");
     	   InstructorDetails details =new InstructorDetails();
     	   details.setHobby("Dancing");
     	    details.setYoutubeChannel("channel-1");
			Instructor instructor = new Instructor();
			instructor.setFirstName("John");
			instructor.setLastName("doe");
			instructor.setEmail("john@email.com");
			details.setInstructor(instructor);
			instructor.setInstructorDetails(details);
			session.getTransaction().begin();
			session.persist(details);
			session.persist(instructor);
			session.getTransaction().commit();
			logger.info("done");*/

			logger.info("done"); 
     	   
 		
 	} catch (Exception e) {
 	
 		e.printStackTrace();
 	}
    }
}
