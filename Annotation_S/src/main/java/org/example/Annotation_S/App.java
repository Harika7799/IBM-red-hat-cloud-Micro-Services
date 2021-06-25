package org.example.Annotation_S;

import org.example.coach.Coach;
import org.example.coach.CricketCoach;
import org.example.main.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		@SuppressWarnings("resources")
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		/*Person person=context.getBean("person",Person.class);
    		System.out.println(person);
    	
    		person.setEmail("john@email.com");
    		person.setFirst_Name("john");
    		person.setLast_Name("doe");
    		person.setP_Id(100);
    		System.out.println(person);
    		
    		Person p1 = context.getBean("thePerson", Person.class);
    		System.out.println(p1);
			System.out.println(person==p1);*/
			
    		Coach thecoach=context.getBean("cricketCoach",CricketCoach.class);
			System.out.println(thecoach.getDailyworkOut());
			System.out.println(thecoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
			
		}
    }
}
