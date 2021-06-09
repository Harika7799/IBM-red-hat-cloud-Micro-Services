package comm.example.demo;

public class Array {
private char[] s;{
	s=new char[27];
	}
public char[] createArray()
{
	for(int i=0;i<s.length;i++)
	{
		s[i]=(char)('A'+i);
	}
	return s;
}
public static void main(String[] args) {
	char[] str =new Array().createArray();
	for(char s:str)
	{
		System.out.println(s);
	}
	System.out.println("======================");
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
}
}
