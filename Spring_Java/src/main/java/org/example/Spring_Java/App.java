package org.example.Spring_Java;

import java.util.Scanner;
import java.util.UUID;
import java.util.Random;
import java.util.List;
import java.util.Iterator;
import org.example.Account.Account;
import org.example.Config.My_Config;
import org.example.Service.Account_S1;
import org.example.Service.Account_S2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	try {
    		@SuppressWarnings("resource")
			ApplicationContext context = new AnnotationConfigApplicationContext(My_Config.class);
    		 Account_S1 service=context.getBean("account_S2",Account_S2.class);
				/*
				 * account.setId(1); String str[]=UUID.randomUUID().toString().split("-");
				 * account.setAccountid(str[4]); account.setAccountHolderName("John Doe");
				 * account.setAccountBalance(10000); System.out.println(account);
				 */ 
    		 int x =0;
    		 String A_HolderName= null;
    		 double balance =0;
    		 do {
 				System.out.println("1. Create Account: ");
 				System.out.println("2: Display All Account: ");
 				System.out.println("3: Update All Account: ");
 				System.out.println("2: Delete All Account: ");
 				System.out.println("0. Exit");
 				System.out.print("Your Choice: ");
 				x=sc.nextInt();
 				switch (x) {
				case 1:
					System.out.print("Account Holder Name: ");
					A_HolderName=sc.next();
					System.out.println("Balance: ");
					balance=sc.nextDouble();
					String str[]=UUID.randomUUID().toString().split("-");
					Account account=new Account();
					account.setId(new Random().nextInt(1000));
					account.setA_Id(str[4]);
					account.setA_HolderName(A_HolderName);
					account.setA_Balance(balance);
					Account tempAccount=service.createAccount(account);
					System.out.println("Account Created Sucessfully: "+tempAccount);
					break;
				case 2:
					List<Account> accounts=service.displayAllAvailableAccount();
					Iterator<Account> i=accounts.iterator();
					System.out.println("================Displaying Account Details==================\n");
					while(i.hasNext())
					{
						System.out.println(i.next());
					}
					break;
				case 3:
					System.out.println("Enter the AccountId to update...");
					String id =sc.next();
					List<Account> accounts1=service.displayAllAvailableAccount();
					Iterator<Account> i1=accounts1.iterator();
					int y=0;
					Account acc;
					while(i1.hasNext())
					{
						acc =i1.next();
						if(acc.getA_Id()==id)
						{
							y=1;
							System.out.println("Enter new Account Holder Name");
							String new_A_HolderName =sc.next();
							System.out.println("New Balance");
							Double balance1 =sc.nextDouble();
							Account acc1 =new Account();
							Account t_A =service.createAccount(acc1);
							System.out.println(" Account updated Successfully..."+t_A);
;							
							
						}
					}
					if(y==0) 
						System.out.println("Account not Found.");
						break;
						case 4:
							System.out.println("Enter the AccountId to Delete...");
							String id2 =sc.next();
							List<Account> accounts2=service.displayAllAvailableAccount();
							Iterator<Account> i2=accounts2.iterator();
							y=0;
							Account acc2;
							while(i2.hasNext()) {
								acc2 =i2.next();
								if(acc2.getA_Id()==id2) {
									x=1;
									service.deleteAccount(acc2);
								}
					}
							if(y==0)
								System.out.println("Account Not Found..");

				default:
					break;
 				}
 				}while(x!=0);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
        
    }
}
