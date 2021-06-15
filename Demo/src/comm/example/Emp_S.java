package comm.example;
import java.io.IOException;
public interface Emp_S {
	 
		
		public void createEmployeeAndSave(Employee employee)throws IOException;
		public Employee displayEmployeeFromFile() throws IOException,ClassNotFoundException ;


}
