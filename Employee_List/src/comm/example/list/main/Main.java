package comm.example.list.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import comm.example.list.Employee;
import comm.example.list.List_E;
import comm.example.list.Emp_C;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Main {

	private static final int Salary = 0;

	public static void main(String[] args)throws IOException,ParseException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter NO.Of Employee ");
		int x=Integer.parseInt(br.readLine());
		List<Employee>employeeList=new ArrayList<Employee>();
		for(int i=0; i <= x;i++) {
			
			System.out.println("Enter Details of the Employee"+(i + 1));
			String Name =br.readLine();
			String Department =br.readLine();
			Date DOJ =new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
		    int Age =Integer.parseInt(br.readLine());
		    Employee e=new Employee(Name,Department,DOJ,Age,Salary);
			employeeList.add(e);
		    }
		System.out.println("Employees by Salary");
		System.out.println("Employees by Age and DOJ");
		System.out.println("Enter Ur Choice");
		int s =Integer.parseInt(br.readLine());
		switch(s) {
		case 1 :
			Collections.sort(employeeList);
			List_E.printEmployees(employeeList);
			break;
		case 2:
			Collections.sort(employeeList, new Emp_C());
			List_E.printEmployees(employeeList);
		}
		
		}
		
	}
			
			
			
			
			
			
			
			
			
			
		