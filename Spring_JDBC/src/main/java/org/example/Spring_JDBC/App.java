package org.example.Spring_JDBC;

import org.example.Config.My_Configuration;
import org.example.Dao.Employee_D1;
import org.example.Dao.Employee_D2;
import org.example.Employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
     	   @SuppressWarnings("resource")
 		ApplicationContext context=new AnnotationConfigApplicationContext(My_Configuration.class);
     	   Employee_D1 employeeDao=context.getBean("employee_D2",Employee_D2.class);
     	   Employee employee=new Employee(1, "John", "Doe", "john@email.com");
     	   System.out.println("employee Created\n"+employeeDao.createEmployee(employee));
     	   
 		
 	} catch (Exception e) {
 		e.printStackTrace();
    }
}
}

