package comm.example;
import java.util.Scanner;
import comm.example.Student;
public class DetailsM {
	private static Scanner sc= new Scanner(System.in);
	public static Student getStudentDetails() {
		System.out.println("Enter the Student Id");
		  int Id=sc.nextInt();
		  System.out.println("Enter the Student name");
		  String Name=sc.next();
		  System.out.println("Enter the Department Id");
		  int DepartmentId=sc.nextInt();
		  System.out.println("Enter the Gender");
		  String Gender =sc.next();
		  System.out.println("Enter the phone number");
		  int Phone=sc.nextInt();
		  System.out.println("Enter the Hostel name");
		  String hostelName=sc.next();
		  System.out.println("Enter the Room Number");
		  int roomNumber=sc.nextInt();
		  Hosteller h= new Hosteller(Id,Name,DepartmentId,Gender,Phone,hostelName,roomNumber);
		  return h;
		  }
	
		 public static void main(String[]args) {
			 Hosteller gd=getHostelDetails();
			 System.out.println("Modify Room Number(Y/N)");
			 int x;
			 x=sc.nextInt();
			 if(x==1) {
				 System.out.println("Enter the Room Number ");
				 int n=sc.nextInt();
				 gd.setRoomNumber(n);
				 System.out.println(gd.getRoomNumber());
			 }
			 System.out.println("Modify Phone Number(Y/N)");
			  x = sc.nextInt();
			  if(x==1) {
				  System.out.println("Enter the Room Number ");
					 int n1=sc.nextInt();
					 gd.setPhone(n1);
					 System.out.println(gd.getPhone());
				  
			  }
}

		private static Hosteller getHostelDetails() {
			return null;
		}
}