package comm.input;
import java.io.File;
import java.io.IOException;
public class Info {
	public static void main(String[] args) {
		String FileName ="Manager.txt";
		File f =new File(FileName);
		try {
			f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Name :"+f.getName());
		if(f.exists()) {
			System.out.println(FileName + "Does Exist");
		}
		if(f.canRead()) {
			System.out.println(FileName + "Is Readable");
		}
		System.out.println(FileName + "is" + f.length() + "long");
		System.out.println(FileName +" is last Modified"+ 
		new java.util.Date(f.lastModified()));
		if(f.canWrite()) {
			System.out.println(FileName +" is writable");
		}else {
			System.out.println(FileName +" Doesn't writable");
			
		}
	}
	
	
	

}
