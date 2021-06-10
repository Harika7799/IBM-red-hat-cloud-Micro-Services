package comm.example.app;
import java.util.Scanner;
import comm.example.Employee1;
import comm.example.Engineer1;
import comm.example.Manager1;
import static java.lang.System.out;
import static java.lang.System.in;
import static comm.example.Employee1.max;
import static java.lang.Math.PI;
import static comm.example.EmployeeType.HOORLY_PAID;
import static comm.example.EmployeeType.SALARIED;
public class App1 {
private static Scanner sc =new Scanner(System.in);
private Employee1[] employees;
{
	employees = new Employee1[5];  
}
public static void main(String[] args) 
{
	App1 app = new App1();
	
	app.employees[0] = new Employee1(10,"harry","porter","harry@email.com",SALARIED);
	app.employees[1] = new Manager1(102,"varush","athidh","varush@email.com",HOORLY_PAID,"design");
	app.employees[2] = new Engineer1(15,"mourish","davan","mourish@email.com",SALARIED,"cse");
	for(int i=0;i<app.employees.length;i++) 
	{
		System.out.println(app.employees[i]);
	}
}

}
