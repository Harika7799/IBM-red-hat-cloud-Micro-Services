package com.example.Service;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.example.Spring_Hibernate_Java.EmployeeNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Configuration.My_Config;
import com.example.RESPONSE.EmployeeRequestModel;
import com.example.RESPONSE.EmployeeResponseModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try
    	 {
      	   
      	   @SuppressWarnings("resource")
  		   ApplicationContext context=new AnnotationConfigApplicationContext(My_Config.class);
      	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      	   Employee_S1 service=context.getBean("employee_S2",Employee_S1.class);
      	  // EmployeeResponseModel model=service.createEmployee(new EmployeeRequestModel("John", "Doe", "john@email.com"));
      	  String First_Name=null,Last_Name=null,Email=null;
      	  int x=-1;
      	   do {
      		  
      			   System.out.println("1.Create Employee");
      			   System.out.println("2.Display Employee");
      			   System.out.println("3.Find_By id Employee");
      			   System.out.println("4.Update Employee");
      			   System.out.println("5.Delete Employee");
      			   System.out.println("Enter ur Choice:");
      			   x=Integer.parseInt(bufferedReader.readLine());
      			   switch(x)
      			   {
      			   case 1:
      				 System.out.println("First Name");
      				 First_Name =bufferedReader.readLine();
      				 System.out.println("Last Name");
     				 Last_Name =bufferedReader.readLine();
     				 System.out.println("Email");
     				 Email =bufferedReader.readLine();
     				 EmployeeResponseModel model=service.createEmployee(new EmployeeRequestModel(First_Name,Last_Name,Email));    
     				 System.out.println(model);
     				 break;
      			   case 2:
      				   List<EmployeeResponseModel> list=service.DisplayAllEmployee();
      				   Iterator<EmployeeResponseModel>i1 =list.iterator();
      				   while(i1.hasNext()) 
      				   {
      					   System.out.println(i1.next());
      				   }
      			   
      				   break;
      			   
      			   case 3:
      				   try {
      					   System.out.println("ID:");
      					   String Id =bufferedReader.readLine();
      					   EmployeeResponseModel Find_By =service.FindBy_Id(Id);
      					   if(Find_By==null)
      					   
      						   System.out.println("Find by employee with id");
      					   
      					   else
      					   {
      						   System.out.println("Employee Found");
      					   }
      				   }catch(EmployeeNotFoundException e)
      				   {
      					   System.err.println(e.getMessage());
      				   }
      				   break;
      			   
      			   case 4:
      				   try {
      				   System.out.println(" Enter Employee ID:");
					   String Id =bufferedReader.readLine();
					   EmployeeResponseModel emp =service.FindBy_Id(Id);
					   if(emp==null)
					   
						   throw new EmployeeNotFoundException("Employee With that id Not Found");
					   else
					   {
						   emp=service.UpdateEmployee(Id);
						   System.out.println("Employee Updated Successfully....");
						   System.out.println(emp);
					   }
     				 }catch(EmployeeNotFoundException e) 
      				  {
     					System.err.println(e.getMessage());
     				 }
      			   
      			   break;
      			   case 5:
      				   try {
      				 System.out.println(" Enter Employee ID:");
					   String Id =bufferedReader.readLine();
					   EmployeeResponseModel emp =service.FindBy_Id(Id);
					   if(emp==null)
						   
						   throw new EmployeeNotFoundException("Employee With that id Not Found");
					   else
					   {
						   service.DeleteEmployee(Id);
					   }
      				   
      				   
      				   } catch(EmployeeNotFoundException e)
      				   {
      					 System.err.println(e.getMessage());
      				   }
      				  
      			   
      					 
      			   break;
      			   }   
      		   
      		 }while(x!=0);
      		   
      	   } catch (Exception e) {
  		
  		e.printStackTrace();
  	}
      
    	   		 
    
    }
}
    	 
    	 
    	
    


