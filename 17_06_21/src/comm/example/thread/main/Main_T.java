package comm.example.thread.main;
import comm.example.thread1.PrintThread;
import comm.example.thread1.PrintRunnable;
public class Main_T {
	public static void main(String[] args) {
		/*ThreadTest t =new ThreadTest();
		Thread t1 =new Thread(t);
		System.out.println(t1.getName());
		t1.start();
		Thread t2 =new Thread(t);
		System.out.println(t2.getName());
		t2.start();
		Thread t3 = new Thread(t);
		System.out.println(t3.getName());
		t3.start();*/
		
		/*PrintThread t =new PrintThread("Harika");
		t.start();
		PrintThread t1 =new PrintThread("Addala");
		t1.start();*/
		//new PrintThread("Harika");
		//new PrintThread("Addala");
		new PrintRunnable("A");
		new PrintRunnable("B");
		
	}

}
