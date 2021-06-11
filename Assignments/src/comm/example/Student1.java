package comm.example;

public class Student1 {
	
	
	private int SId;
	private String Name;
	private int[] marks;
	private static float avg;
	private static char grade;
	public Student1() {
		super();
	
	}
	public Student1(int sId, String name, int[] marks) {
		super();
		this.SId = sId;
		this.Name = name;
		this.marks = marks;
	}
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void  Avg() {
		int total=0;
		for(int i=0;i<getMarks().length;i++)
		{
			total=total+marks[i];
		}
		avg =total/getMarks().length;
	}
	public static float getAvg() {
		return avg;
	}
	public static void setAvg(float avg) {
		Student1.avg = avg;
	}
	public void Findgrade() {
		int x =0;
		if(avg>=75 && avg<=100)
		{
			grade ='O';
		}
		else {
			grade ='A';
		}
		for(int i=0;i<getMarks().length;i++) {
			if(marks[i]<35)
			{
				x=1;
				break;
			}
			else
				continue;
		}
		
		if(x==1) {
			grade ='F';
		}
	}
	public static char getGrade() {
		return grade;
	}
	public static void setGrade(char grade) {
		Student1.grade = grade;
	}
}
