package comm.model.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Order_F {
private FileOutputStream fos;
private FileInputStream fis;
private ObjectOutputStream oos;
private ObjectInputStream ois;
private File f;
private static Scanner sc = new Scanner(System.in);
private final String FileName;
{
	FileName = "Order.txt";
	try {
		f = new File(FileName); 
		fos = new FileOutputStream(f);
		oos = new ObjectOutputStream(fos);
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
public void saveOrder(List<Order> l)throws IOException
{
	oos.writeObject(l);
	System.out.println("Order Saved Sucessfully..");
}
public List<Order> displayAllOrders() throws ClassNotFoundException, IOException
{
	fis = new FileInputStream(f);
	ois = new ObjectInputStream(fis);
	List<Order> o1 =(List<Order>)ois.readObject();
	return o1;

}
}












