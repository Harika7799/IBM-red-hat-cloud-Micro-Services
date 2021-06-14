package comm.example;

public class Student {
	private int StudentId;
	private String StudentName;
	private double GPA;
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, double gPA) {
		super();
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.GPA = gPA;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", GPA=" + GPA + "]";
	}
	

	

}
