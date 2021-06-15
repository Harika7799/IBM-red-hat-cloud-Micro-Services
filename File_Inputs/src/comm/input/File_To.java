package comm.input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	Student s=new Student(UUID.randomUUID().toString(),"mourish","C");
	Student s1=new Student(UUID.randomUUID().toString(),"nayan","A");
	Student s2=new Student(UUID.randomUUID().toString(),"hashish","B");
	Student s3=new Student(UUID.randomUUID().toString(),"somu","A");
	set.add(s);
	set.add(s1);
	set.add(s2);
	set.add(s3);
	PrintWriter p = new PrintWriter(f);
	Iterator<Student> i =set.iterator();
	Student stu =null;
	while(i.hasNext()) 
	{
		stu =i.next();
		String str= stu.getStudentId()+","+stu.getFirstName()+","+stu.getGpa();
		Writer.println(stu.toString());
		System.out.println(stu);
	}
	Writer.close();
}
}
	

}
