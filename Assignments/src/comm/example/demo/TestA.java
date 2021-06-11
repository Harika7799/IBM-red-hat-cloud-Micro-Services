package comm.example.demo;
import comm.example.SavingsA;
import comm.example.Customer;
import java.util.Scanner;

public class TestA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cu =new Customer();
		System.out.println("Enter Amount: ");
		double wd=sc.nextInt();
		SavingsA s=new SavingsA(14,cu,654000,1500);
		s.WithDraw(30000);
		
	}

}
