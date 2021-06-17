package comm.input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class File_To {
public static void main(String[] args)throws IOException{
	File outputFile =new File(args[0]);
	FileWriter f =new FileWriter(outputFile);
	Set<Student> set =new TreeSet<Student>();
	Student s=new Student(UUID.randomUUID().toString(),"mourish","john","mourish@email.com",8.9);
	Student s1=new Student(UUID.randomUUID().toString(),"nayan","A","nayan@email.com",7.4);
	Student s2=new Student(UUID.randomUUID().toString(),"hashish","B","hashish@email.com",8.5);
	Student s3=new Student(UUID.randomUUID().toString(),"somu","A","somu@email.com",6.8);
	set.add(s);
	set.add(s1);
	set.add(s2);
	set.add(s3);
	PrintWriter p = new PrintWriter(f);
	Iterator<Student> i =set.iterator();
	Student stu =null;
	OutputStreamWriter writer;
	while(i.hasNext()) 
	{
		stu =i.next();
		String str= stu.getStudentId()+","+stu.getFirstName()+stu.getLastName()+","+stu.getGpa();
		writer.println(stu.toString());
		System.out.println(stu);
	}
	writer.close();
}
}
	


