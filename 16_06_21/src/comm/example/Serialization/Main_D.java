package comm.example.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;


public class Main_D {
	private static Scanner sc= new Scanner(System.in);
	/*public Set<Director> set =null;
	private File f;
	private FileInputStream fis;
	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	public Main_D()throws IOException, ClassNotFoundException{
		set = new HashSet<Director>();
		set.add(new Director());
		set.add(new Director(2,"ronith"));
		set.add(new Director(5,"sourod"));
		f =new File("Director.ser");
		fis =new FileInputStream(f);
		ois =new ObjectInputStream(fis);
		fos = new FileOutputStream(f);
		oos =new ObjectOutputStream(fos);
		oos.writeObject(set);
		Set<Director> set1 =(Set<Director>)ois.readObject();
		System.out.println(set1);

}*/
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//Main_D m =new Main_D();
		File f =new File("Director.ser");
		FileInputStream fis;
		FileOutputStream fos;
		ObjectOutputStream oos;
	    ObjectInputStream ois;
	    Set<Director> s =new HashSet<Director>();
	    int x ;
	    do {
	    	System.out.println(" Enter U R Choice :");
	    	System.out.println(" Create :");
	    	System.out.println(" Display :");
	    	System.out.println(" Remove :");
	    	System.out.println(" Update :");
	    x =sc.nextInt();
	    switch(x) {
	    case 1:
	    	System.out.println(" Enter The Name:");
	    	String Name =sc.next();
	    	System.out.println(" Enter ID:");
	    	int Id = sc.nextInt();
	    	s.add(new Director(UUID.randomUUID().toString(),Id,Name));
	    	break;
	    
	    case 2:
	    	Iterator<Director> i =s.iterator();
	    	Director d =null;
	    	while(i.hasNext()) {
	    		d =i.next();
	    		String str = d.getId()+","+d.getName();
	    		System.out.println(str);
	    	}
	    	break;
	    case 3:
	    	int y = 0;
	    	System.out.println(" Select ID To Update:");
	    	int u = sc.nextInt();
	    	Iterator<Director> i1 =s.iterator();
	    	Director d1 =null;
	    	while(i1.hasNext()) 
	    	{
	    		d1 =i1.next();
	    		if(u == d1.getId()) {
	    			y=1;
	    			System.out.println("Select Name To Update:");
	    			String n =sc.next();
	    			s.add(new Director(u,n));
	    			System.out.println("Updated Successfully....");
	    			break;

	    		}
	    	}
	       if(y == 0) {
	    	   System.out.println("Director Not Yet....");
	       }
	       break;
	    case 4:
	    	y = 0;
	    	System.out.println(" Select ID To Remove:");
	    	int r = sc.nextInt();
	    	Iterator<Director> i2 =s.iterator();
	    	Director d2 =null;
	    	while(i2.hasNext()) 
	    	{
	    		d2 =i2.next();
	    		if(r == d2.getId()) {
	    			s.remove(d2);
	    			System.out.println("Removed Successfully....");
	    }
		
	}
	    	if(y == 0) {
		    	   System.out.println("Director Not Yet....");
		       }
	    	break;
	    case 5:
	    	fos = new FileOutputStream(f);
			oos =new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("Saved The File....");
			
	    case 6:
	    	if(s.isEmpty()) 
	    		System.out.println("None ......");
	    		else {
	    			fis =new FileInputStream(f);
	    			ois =new ObjectInputStream(fis);
	    			Set<Director> s1 =(Set<Director>)ois.readObject();
	    			System.out.println(s1);

	    		}
	    			
	    		}
	    }while(x!=0);
}
}