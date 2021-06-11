package com.example.test;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;
import com.example.exception.ExceptionT;
public class Test {
	private static Scanner sc=new Scanner(System.in);
    
	private ExceptionT[] exception;
	
	{
		exception=new ExceptionT[5];
	}
	
	public static void main(String args[])
	{
		Test t=new Test();
		for(int i=0;i<5;i++)
		{
			try {
				String tempId =UUID.randomUUID().toString();
				System.out.print("ToDo Desc: ");
				String tempDesc=sc.next();
				System.out.print("isCompleted? ");
				boolean tempIsCompleted=sc.nextBoolean();
				t.exception[i]=new ExceptionT(UUID.randomUUID().toString(), tempDesc, tempIsCompleted);
			}catch(ArrayIndexOutOfBoundsException e) 
			{
				System.err.println("Array index out of bound exception.");
			}catch(InputMismatchException e) 
			{
				System.err.println("Enter input value:");
				i--;
				continue;
			}
			
		}
		for(int i1=0;i1<=5;i1++) {
			System.out.println(t.exception[i1]);
			
		}
	
    }
}


