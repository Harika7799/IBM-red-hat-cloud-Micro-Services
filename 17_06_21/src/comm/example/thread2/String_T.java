package comm.example.thread2;

public class String_T implements Runnable {
	
	private Thread t;
	private String s1;
	private String s2;
	private Two_String t1;
	public String_T(String s1, String s2,Two_String t1) {
		super();
		this.t = t;
		this.s1 = s1;
		this.s2 = s2;
		this.t1 = t1;
		t =new Thread(this);
		t.start();
	}

	

	@Override
	public void run() {
		//Two_String.Print(s1,s2);
		synchronized(t1) {
		t1.Print(s1,s2);
		
	}

}}
