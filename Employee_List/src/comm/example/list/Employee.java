package comm.example.list;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
	static int count;
    private int Id;
	private String Name;
	public Employee( String name, String department, Date dOJ, int age, int salary) {
		super();
		Id = ++count;
		this.Name = name;
		this.Department = department;
		this.DOJ = dOJ;
		this.Age = age;
		this.Salary = salary;
	}
	
	private String Department;
	private Date DOJ;
	private int Age;
	private int Salary;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n",Id,Name,Department,new SimpleDateFormat("MM/dd/yyyy").format(DOJ),Age,Salary);
		return "";
		
	}
	
	public int compareTo(Employee e)
	{
		if(Salary==e.Salary)
			return 0;
		else if(Salary>e.Salary)
			return 1;
		else
			return -1;
	}
		
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
}

		








