package org.example.Set_Hibernet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.example.Hibernate_Employee.Employee;
import org.example.dao.EmployeeNotFoundException;
import org.example.dao.StudentNotFoundException;
import org.example.service.Student_I;
import org.example.service.Student_S;
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
    	/*try {
    		
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
		}*/
    	Student student=new Student();
    	PropertyConfigurator.configure("log4j.properties");
    	Student_S  service= new Student_I();
    	 BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
         String first_Name,last_Name,email=null;
     	 int x=0;
     	do {
    		try {
        		System.out.println("1. Create Student.");
        		System.out.println("2. Display All Students");
        		System.out.println("3. Find Student By Id: ");
        		System.out.println("4. Update Student By Id");
        		System.out.println("5. Delete Student By Id");
        		System.out.println("0. Exit");
        		System.out.print("Enter Your Choice: ");
        		x=Integer.parseInt(bufferedReader.readLine());
        		switch (x) {
        		case 1:
        			System.out.print("First Name: ");
    				first_Name=bufferedReader.readLine();
    				System.out.print("Last Name: ");
    				last_Name=bufferedReader.readLine();
    				System.out.print("Email: ");
    				email=bufferedReader.readLine();
    				student.setEmail(email);
    			Set<String> set = student.getImages();
                System.out.println("What images u Want");
                int id= Integer.parseInt(bufferedReader.readLine());
                for(int i =0;i<id;i++) {
                	System.out.println("Enter image name" +id);
                	String image1 =bufferedReader.readLine();
                	set.add(image1);
                }
                student.setImages(set);
                logger.info("done");
                student =service.createStudent(student);
                System.out.println(student);
                break;
        		case 2:
        			List<Student> list=service.displayAllStudent();
    				Iterator<Student> iterator=list.iterator();
    				while(iterator.hasNext())
    				{
    					System.out.println(iterator.next());
    				}
    				break;
                
        		case 3:
        			System.out.print(" Enter id: ");
    				id=Integer.parseInt(bufferedReader.readLine());
    				student=service.findById(id);
    				if(student==null)
    				{
    					System.out.println("No Such employee found. ");
    				}
    				else
    				{
    					System.out.println("employee found: "+student);
    				}
    				
    				break;
        		case 4:
    				logger.info("Upadting....");
    				try {
    					System.out.print("Id");
    					id=Integer.parseInt(bufferedReader.readLine());
        				student=service.updateStudent(id);
        				System.out.println("updated: "+student);
        				logger.info("updated");
    					
    				}catch(StudentNotFoundException e)
    				{
    					System.err.println(e.getMessage());
    				}
    			break;
        		case 5:
    				logger.info("deleting...");
    				try {
    					System.out.print("Id");
    					id=Integer.parseInt(bufferedReader.readLine());
    					service.deleteStudent(id);
    					logger.info("deleted");
    				}catch(StudentNotFoundException e )
    				{
    					System.err.println(e.getMessage());
    				}
					break;
    			default:
    				System.out.println("invalid choice:");
    				break;
    			}
    			
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        		
     	}while(x!=0);
			
    }
}


