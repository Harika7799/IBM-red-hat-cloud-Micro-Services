package comm.example;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Emp_S1 implements Emp_S {
	private FileOutputStream fileOutputStream;
	private ObjectOutputStream objectOutputStream;
	private FileInputStream fileInputStream;
	private ObjectInputStream objectInputStream;

	@Override
	public void createEmployeeAndSave(Employee employee) throws IOException {
		fileOutputStream=new FileOutputStream("employee.file");
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		
	}

	@Override
	public Employee displayEmployeeFromFile() throws IOException, ClassNotFoundException {
		fileInputStream=new FileInputStream("employee.ser");
		objectInputStream =new ObjectInputStream(fileInputStream);
		Employee e=(Employee)objectInputStream.readObject();
		return e;
	}

}
