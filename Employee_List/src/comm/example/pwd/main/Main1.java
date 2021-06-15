package comm.example.pwd.main;

import java.util.Scanner;

import comm.example.pwd.Pwd;

public class Main1 {
	public static void main(String[] str)
	{
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Please enter the password you want to set :");
		    String password=sc.nextLine();
		    if(Pwd.validatePassword(password))
		      System.out.println("The password is valid..");
		    else
		      System.out.println("The password is invalid..");
	}
}
