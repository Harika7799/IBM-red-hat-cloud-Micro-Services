package org.example.Hibernate_Employee.main;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.example.Hibernate_Employee.*;
import org.example.dao.EmployeeNotFoundException;
import org.example.service.Employee_I;
import org.example.service.Employee_S;
public class App 
{
private static Logger logger =Logger.getLogger("org.example.Hibernate_Employee.main.App.class");
    public static void main( String[] args )
    {
    	PropertyConfigurator.configure("log4j.properties");
    	logger.info("Service Layer Initiating");
    	 Employee_S service=new Employee_I();
    	logger.info("Service Layer Initiated");
     	 BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
         String first_Name,last_Name,email=null;
     	int x=0;
     	logger.info("Going to do While loop");
     	do {
    		try {
        		System.out.println("1. Create Employee.");
        		System.out.println("2. Display All Employees");
        		System.out.println("3. Find Employee By Id: ");
        		System.out.println("4. Update Employee By Id");
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
    				Employee employee=new Employee(new Random().nextInt(10000), first_Name, last_Name, email);
    				employee= service.createEmployee(employee);
    				System.out.println("Created: "+employee);
    				break;
    			case 2:
    				List<Employee> list=service.displayAllEmployee();
    				Iterator<Employee> iterator=list.iterator();
    				while(iterator.hasNext())
    				{
    					System.out.println(iterator.next());
    				}
    				break;
    			case 3:
    				System.out.print("id: ");
    				int id=Integer.parseInt(bufferedReader.readLine());
    				employee=service.getemployeeById(id);
    				if(employee==null)
    				{
    					System.out.println("No Such employee found. ");
    				}
    				else
    				{
    					System.out.println("employee found: "+employee);
    				}
    				
    				break;
    			case 4:
    				logger.info("Upadting....");
    				try {
    					System.out.print("Id");
    					id=Integer.parseInt(bufferedReader.readLine());
        				employee=service.updateEmployee(id);
        				System.out.println("updated: "+employee);
        				logger.info("updated");
    					
    				}catch(EmployeeNotFoundException e)
    				{
    					System.err.println(e.getMessage());
    				}
    			break;
    			case 5:
    				logger.info("deleting...");
    				try {
    					System.out.print("Id");
    					id=Integer.parseInt(bufferedReader.readLine());
    					service.deleteEmployee(id);
    					logger.info("deleted");
    				}catch(EmployeeNotFoundException e)
    				{
    					System.err.println(e.getMessage());
    				}
					break;
    			default:
    				System.out.println("invalid choice:");
    				break;
    			}
    			
    		} catch (Exception e) {
    			
    		}
			
		} while (x!=0);
        		
        		}

    		}
