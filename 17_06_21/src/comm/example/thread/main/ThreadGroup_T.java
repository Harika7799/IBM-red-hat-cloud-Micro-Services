package comm.example.thread.main;
import comm.example.thread1.PrintThread;
public class ThreadGroup_T {

	public static void main(String[] args) {
		new PrintThread("himanshu").start();
		new PrintThread("surved").start();
		new PrintThread("gurav").start();
		ThreadGroup group =Thread.currentThread().getThreadGroup();
		Thread [] t1 =new Thread[10];
		int actualSize =group.enumerate(t1);
		for(int i=0;i <actualSize; i++) {
			System.out.println("Thread" +t1[i].getName()+"in the Thread Group"+group.getName());
		}
		

	}

}
