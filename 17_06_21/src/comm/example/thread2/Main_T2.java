package comm.example.thread2;

public class Main_T2 {
	public static void main(String[] args)
	{
		Two_String t1 = new Two_String();
		new String_T("Hey","How are U", t1);
		new String_T("Doing","Good",t1);
		new String_T("Great","Job",t1);
	}
}
