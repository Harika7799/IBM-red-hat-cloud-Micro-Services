package comm.example.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.io.*;

import comm.example.test.Student;
public class FileToCollection {
	
	private Set<Student> set=new TreeSet<Student>();
	File inputFile =new File("students.txt");
	public Set<Student>create()throws IOException{
	FileReader f =new FileReader(inputFile);
	BufferedReader input=new BufferedReader(f);
	String l =null;
	while((l=input.readLine())!=null)
	{
		String str[]=l.split(",");
		Student s =new Student();
		s.setStudentId(UUID.randomUUID().toString());
		s.setFirstName(str[0]);
		s.setLastName(str[1]);
		s.setEmail(str[3]);
		s.setGpa(Double.parseDouble(str[3]));
		set.add(s);
	}
	

	input.close();
	return set;

}
}
