package comm.example.thread1;

public class PrintRunnable  implements Runnable{
	private String name;
	private Thread t;
	public PrintRunnable(String name) {
		this.name =name;
		t =new Thread(this,name);
		System.out.println(t.getName());
	    t.start();
		
	}
	@Override
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.println(name +" "+i);
		}

	}
	

}
