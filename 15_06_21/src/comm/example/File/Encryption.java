package comm.example.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryption {
	public static void main(String[] args)throws IOException,FileNotFoundException
	{
		File inputFile = new File("farrago.txt");
		File outputFile =new File("outgain.txt");
		FileInputStream inputStream =new FileInputStream(inputFile);
		FileOutputStream outputStream =new FileOutputStream(outputFile);
		int ch;
		while((ch =inputStream.read())!=-1) {
			System.out.println(ch);
			if(ch==26||ch==10)
				outputStream.write(ch);
			else
				outputStream.write(ch+2);
		}
		inputStream.close();
		outputStream.close();
	}
}
