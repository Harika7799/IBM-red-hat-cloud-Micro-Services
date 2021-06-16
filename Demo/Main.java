package comm.example.main;
import java.io.IOException;
import java.util.UUID;

import comm.example.Emp_S;
import comm.example.Emp_S1;
import comm.example.Employee;
public class Main {

	public static void main(String[] args)throws IOException,ClassNotFoundException{
		Employee employee=new Employee(UUID.randomUUID().toString(),"John","India");
		Emp_S service=new Emp_S1();
		service.createEmployeeAndSave(employee);
		System.out.println("Done");
		System.out.println(service.displayEmployeeFromFile());
	

	}

}
