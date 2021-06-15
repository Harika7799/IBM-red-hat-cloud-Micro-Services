package comm.example.test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import comm.example.test.Student;
import comm.example.File.FileToCollection;

public class Tester {
	public static void main(String args[]) throws IOException {
		FileToCollection fileToCollection = new FileToCollection();
		Set<Student> set = fileToCollection.create();
		Iterator<Student> i = set.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	

}
