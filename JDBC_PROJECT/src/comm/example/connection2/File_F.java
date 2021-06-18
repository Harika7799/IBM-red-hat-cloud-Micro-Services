package comm.example.connection2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import comm.example.jdbc.Employee_J;

public class File_F {
	
	public List<Employee_J> file1(String files)throws IOException{
		List<Employee_J> list =new ArrayList<Employee_J>();
		File f =new File(files);
		FileReader fr= new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String l;
		while((l=br.readLine())!=null)
{
	String[] s=l.split(",");
	Employee_J E= new Employee_J();
	E.setFirstName(s[0]);
	E.setLastName(s[1]);
	E.setEmail(s[2]);
	list.add(E);
}
		br.close();
		return list;
	}

}
