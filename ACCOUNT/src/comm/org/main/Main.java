package comm.org.main;

import java.io.BufferedReader;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.Iterator;

import comm.org.account.A_Type;
import comm.org.account.Account;
import comm.org.account.Address;
import comm.org.account.City;
import comm.org.account2.Account_D1;
import comm.org.account3.AccountNotValidException;
import comm.org.account3.Account_DAO;
import comm.org.account3.Account_DAO2;
import comm.org.service.Account_I;
import comm.org.service.Account_S;

public class Main {
	
     private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws SQLException, AccountNotValidException {
		Account_DAO a1 =new Account_DAO2();
		Account_S s= new Account_I();
		Address a= null;
		int x =0;
		
		/*Account a= a1.createAccount(new Account(UUID.randomUUID().toString(),"Honey",A_Type.SAVINGS,new Address("2A","India",City.HYDERABAD,50000)));
		System.out.println(a);
		List<Account_D1> list=a1.displayAllAccount();
    	for(Account_D1 dto:list)
    	{
    		System.out.println(dto);
    	}*/
		do {
			System.out.println("1.Create Account:");
			System.out.println("2.Display Account");
			System.out.println("3.Deposit Account");
			System.out.println("4.Withdraw Amount");
			System.out.println("0.Exit");
			x =sc.nextInt();
			switch(x){
			case 1:
				int y;
				String AType =null, city=null;
				System.out.println("Enter Account Type:");
				System.out.println("1.Savings Account");
				System.out.println("2.Credit_Card");
				System.out.println("3.Loan");
				System.out.println("4.Current");
				y =sc.nextInt();
	    if(y==1)
	    {
	    	AType =A_Type.SAVINGS.toString();
	    }
	    else if(y==2)
	    {
	    	AType =A_Type.CREDIT_CARD.toString();
	    }
	    else if(y==3)
	    {
	    	AType =A_Type.LOAN.toString();
	    }
	    else if(y==4) 
	    {
	    	AType =A_Type.CURRENT.toString();
	    }
	    else
	    {
	    	System.out.println("Valid Account Type");
	    }
	    System.out.println("Enter Account Holder Name");
	    String name =sc.next();
	    System.out.println("Enter Address");
	    System.out.println("Enter AddressLine1:");
	    String a_Line1 =sc.next();
	    System.out.println("Enter AddressLine2");
	    String a_Line2 =sc.next();
	    System.out.println("Enter City");
	    System.out.println("1.Hyderabad");
	    System.out.println("2.chennai");
	    System.out.println("3.Mumbai");
	    System.out.println("4.Kolkata");
	    int City_c =sc.nextInt();
	    if(City_c==1)
	    {
	    	city =City.HYDERABAD.toString();
	    }
	    else if(City_c==2)
	    {
	    	city =City.CHENNAI.toString();
	    }
	    else if(City_c==3)
	    {
	    	city =City.MUMBAI.toString();
	    }
	    else if(City_c==4)
	    {
	    	city =City.KOLKATA.toString();
	    }
	    else
	    {
	    	System.out.println("Valid Chioce:");
	    }
	    Account account= a1.createAccount(new Account(UUID.randomUUID().toString(),"Marry",A_Type.valueOf(AType),new Address(a_Line1,a_Line2,City.valueOf(city)),5000));
	    System.out.println(account);
	    break;
			
		case 2:	
			List<Account_D1>list =a1.displayAllAccount();
			Iterator<Account_D1>i1 =list.iterator();
			while(i1.hasNext())
			
				System.out.println(i1.next());
			break;
		case 3:
			 System.out.println("Enter Amount to Deposit");
			 double amount =sc.nextDouble();
			 a1.deposite(amount);
			 break;
			 
		case 4:
			 System.out.println("Enter the Withdraw Amount");
			 amount =sc.nextDouble();
			 double balance =a1.withdrawl(amount);
			 System.out.println("Total Amount(Available)");
			 break;
			 
		case 0:
			System.out.println("Thank uu...");
			 System.exit(0);
			 break;
		default:
			System.out.println("Invalid Choice.....");
			break;
			}
		}while(x!=0);
	}
}
