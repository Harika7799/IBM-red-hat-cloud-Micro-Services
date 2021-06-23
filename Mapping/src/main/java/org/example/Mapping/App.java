package org.example.Mapping;
import java.util.logging.Logger;
import org.example.instructor.Instructor;
import org.example.instructor.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = Logger.getLogger("org.example.demo.App.class");
    	try {
     	   
     	   SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
     	   Session session= sf.getCurrentSession();
 		
 			/*Instructor instructor=new Instructor();
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
 		     
     	   Instructor instructor1=session.get(Instructor.class, 1);
 		   InstructorDetails details1=instructor.getInstructorDetails();
 			 details.setHobby("Cricket"); 
 			 details.setYoutubeChannel("my-channel-1");
 			 instructor.setEmail("john1@email.com");
 			 session.merge(instructor);
 			 session.getTransaction().commit();
 			 session.delete(instructor);
     	     session.getTransaction().commit();
     	     System.out.println("done");*/
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
			logger.info("done");

     	   
     	   
 		
 	} catch (Exception e) {
 	
 		e.printStackTrace();
 	}
    }
}
