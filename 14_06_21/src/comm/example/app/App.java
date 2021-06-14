package comm.example.app;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;
import comm.example.Student;
import comm.example.Employee;
public class App 
{
	private static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) 
	{
	    /*Vector<Student> vector = new Vector<Student>();
		vector.add(new Student(1,"Sammy",5.9));
		vector.add(new Student(2,"Raster",6.2));
		vector.add(new Student(3,"Monster",7.8));
		for(Student s:vector) {
			System.out.println(s);
		}
		Enumeration<Student> e =vector.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		Iterator<Student>i =vector.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Stack<Student> stack = new Stack<Student>();
		stack.push(new Student(4,"Roar",7.6));
		stack.push(new Student(5,"Mansh",5.8));
		int v=stack.capacity();
		System.out.println(v);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		Collection<Student> coll =new ArrayList<>();
		coll.add(new Student());
		coll.add(new Student());
		stack.addAll(coll);
		System.out.println(".............\n");
		Enumeration<Student>s=stack.elements();
		while(s.hasMoreElements()) 
		{
			System.out.println(s.nextElement());
		}*/
		

		/*Vector<Employee> vector = new Vector<Employee>();
		vector.add(new Employee(UUID.randomUUID().toString(),"John","Doe","john@email.com",20000));
		vector.add(new Employee(UUID.randomUUID().toString(),"John1","Doe1","john1@email.com",25000));
		vector.add(new Employee(UUID.randomUUID().toString(),"John2","Doe2","john2@email.com",19000));
		
		for(Employee e:vector) {
			System.out.println(e);
		}
		Iterator<Employee>i =vector.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Set<Employee> set = new TreeSet<Employee>();
		set.add(new Employee(UUID.randomUUID().toString(),"John3","Doe3","john3@email.com",26000));
		set.add(new Employee(UUID.randomUUID().toString(),"John4","Doe4","john4@email,com",17000));
		int v= set.size();
		System.out.println(set);
		Collection<Employee> coll =new ArrayList<>();
		coll.add(new Employee());
		coll.add(new Employee());
		set.addAll(coll);*/
		/*System.out.println(".............\n");
		Enumeration<Employee>s=TreeSet.elements();
		while(s.hasMoreElements()) 
		{
			System.out.println(s.nextElement());
		}*/
		Set<Employee> set = new TreeSet<Employee>();
		App a= new App();
		String s= "True";
		while(s.equals("True")) {
			Employee e =new Employee();
			System.out.println("Enter First Name:");
			e.setFirstName(sc.next());
			System.out.println("Enter Last Name:");
			e.setLastName(sc.next());
			System.out.println("Enter Email:");
			e.setEmail(sc.next());
			double salary = 0;
			do {
				try {
					System.out.println("Enter Salary:");
					salary =sc.nextDouble();
					a.check(salary);
					e.setSalary(salary);
				}
				catch(Exception x) {
					System.err.println(x);
				}
			}while(salary !=0 && salary < 5000);
			e.setEmployeeId(UUID.randomUUID().toString());
			set.add(e);
			System.out.println("Enter Another one..");
			s =sc.next();
		}
		Iterator<Employee>i =set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
	}
	}
private void check(double salary) {
	if (salary < 5000) {
		throw new InvalidSalary("Salary Above 5000 ");
	}
	
}
}
		

	

	

