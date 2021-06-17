package comm.example.thread2;

public class Two_String {
	
public synchronized static void Print(String s1, String s2) {
	System.out.print(s1);
	try {
		Thread.sleep(5000);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	System.out.println(s2);
}
}
