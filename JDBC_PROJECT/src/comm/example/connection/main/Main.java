package comm.example.connection.main;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Iterator;
import java.util.List;
import comm.example.connection2.EmployeeDao;
import comm.example.connection2.EmployeeNotFoundException;
import comm.example.connection2.Employee_D;
import comm.example.connection2.File_F;
import comm.example.jdbc.Employee_J;
import comm.example.service.Employee_I;
import comm.example.service.Employee_S;


public class Main {

	public static void main(String[] args)throws SQLException,NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File_F f2 =new File_F();
		Employee_S service = new Employee_I();
		int x = 0;
		String firstName, lastName, email = null;
		do {
			
			System.out.println("1. Create a new employee");
			System.out.println("2. Display all available employees");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			x = Integer.parseInt(br.readLine());
			switch (x) {
			case 1:
				System.out.print("Enter Id: ");
				email =br.readLine();
				System.out.print("Enter first name: ");
				firstName = br.readLine();
				System.out.print("Enter last name:");
				lastName = br.readLine();
				System.out.print("Enter email: ");
				email = br.readLine();
				Employee_J e = service.createEmployee(new Employee_J(new Random().nextInt(100), firstName, lastName, email));
				System.out.println(e);
				break;
			case 2:
				List<Employee_J> employees = service.getAllEmployees();
				Iterator<Employee_J> iterator = employees.iterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());
				break;
			case 3:
				System.out.println("Enter Id: ");
				Integer Id = Integer.parseInt(br.readLine());
				List<Employee_J> list=service.findById(Id);
				if(list.isEmpty())
				{
					System.out.println("NO such record found with id: "+Id);
				}
				else
				{
					for(Employee_J e1:list)
					{
						System.out.println(e1);
					}
				}
				break;
			case 4:
				try {
					System.out.println("Enter File Name");
					String files =br.readLine();
					List<Employee_J> list1 =f2.file1(files);
					Iterator<Employee_J> i= list1.iterator();
					while(i.hasNext()) {
						Employee_J E =i.next();
						E=service.createEmployee(new Employee_J(new Random().nextInt(50),E.getFirstName(),E.getLastName(),E.getEmail()));
					}
					System.out.println("File Added Successfully:");
				}catch(FileNotFoundException n) {
					System.out.println("File Not Available");
					
				}break;
			case 5:
				System.out.print("enter id: ");
				Id = Integer.parseInt(br.readLine());
				e=service.updateEmployee(Id);
				System.out.println("Updated Employee:\n"+e);
				break;
			case 6:
				try {
					System.out.println("Enter Id: ");
					Id = Integer.parseInt(br.readLine());
					List<Employee_J> E =service.deleteEmployee(Id);
					System.out.println("Employee id Deleted.. ");
					System.out.println(E);
					
				}catch(EmployeeNotFoundException m) {
					
					
				}
		
			case 0:
				System.out.println("Thank uu");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

} while (x != 0);

		

	}
		
		
	}

