package comm.model.example.demo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Random;

import comm.model.example.Order;
import comm.model.example.Order_F;
import comm.model.example.Order_S;
import comm.model.example.Order_S1;
public class App {
	public static void main(String[] args)throws NumberFormatException, IOException, ClassNotFoundException{
		
	   Order_S service=new Order_S1(); 
	   Order_F factory=new Order_F(); 
	   int x =0; 
	   InputStreamReader reader=null;
	   BufferedReader br=null;
	   reader=new InputStreamReader(System.in);
	   br=new BufferedReader(reader);
		  
		do { 
			System.out.println("1.Create A New Order.");
		    System.out.println("2.Display All Orders From List(in Memory).");
		    System.out.println("3.Save Orders To File.");
		    System.out.println("4. Display All Orders From File(order.ser)");
		    System.out.print("Your Choice");
		    x=Integer.parseInt(br.readLine()); 
		    switch (x) {
		    case 1:
		        System.out.print("Enter Order Quantity: "); 
		        int quantity=Integer.parseInt(br.readLine());
		        System.out.print("Order By: "); 
		        String orderBy=br.readLine();
		        System.out.print("Order Name: ");
		        String orderName=br.readLine();
		        Order tempOrder=new Order(); 
		        tempOrder.setOId(new Random().nextInt());
		        tempOrder.setODate(new Date()); 
		        tempOrder.setQuantity(quantity);
		        tempOrder.setOrderBy(orderBy); 
		        tempOrder.setOName(orderName); 
		        Order o=service.create(tempOrder);
		        System.out.println("Order Created Sucessfully..-->\n"+o+"\n"); 
		        break; 
		        case 2:
		         List<Order> list=service.getAllOrder(); 
		         for(Order ord:list) {
		         System.out.println(ord); 
		         } 
		         break; 
		        case 3:
		        	List<Order>list1=service.getAllOrder(); System.out.println("saving orders please wait");
		        	factory.saveOrder(list1); 
		        	break;
		        case 4:
		        	List<Order>orderList=factory.displayAllOrders();
		        	for(Order order:orderList) {
	                 System.out.println(order);
	                 }
		        	break;
		        case 0:
		
		                System.out.println("Bye"); 
		                System.exit(0);
		                break; 
		         default:
		                 System.out.println("Invalid choice.");
		                 break;
		                 }
		  
		  } while (x !=0);
		 
		
		/*
		 * ObjectOutputStream objectOutputStream= new ObjectOutputStream(new
		 * FileOutputStream(new File("myfile.ser"))); objectOutputStream.writeObject(new
		 * Order(2,new Date(),10,"mobile","Marry",false));
		 */

		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(new File("myfile.ser")));
	Order ord =(Order)ois.readObject();
	System.out.println(ord);
	 
	}

}

