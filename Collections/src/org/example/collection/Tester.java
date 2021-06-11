package org.example.collection;

import java.util.Collection.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Tester {
	private Map<Integer, Collection>m =null;
	{
		m =new HashMap<Integer,Collection>();
		
	}
	private static Scanner sc=new Scanner(System.in);
	private void checkPrice(double price) {
		if(price <=100) {
			throw new InvalidPriceException("Invalid Price...");
		}
	}
	public static void main(String[] args) 
	{
		int Key =1;
		int Choice =0;
		Tester t =new Tester();
		do {
			try {
				System.out.println("1. Add A New Collection.");
				System.out.println("2. Display All Available Collection.");
				System.out.println("3. Fidn A Beer.");
				System.out.println("4. Delete a Beer.");
				System.out.println("0. Quit");
				System.out.print("Enter Your choice: ");
				Choice=sc.nextInt();
				switch(Choice) {
				case 1:
					System.out.print("Collection Name: ");
					String name=sc.next();
					System.out.print("Collection Price: ");
					double price=sc.nextDouble();
					try {
						
					}catch(InvalidPriceException e) {
						System.out.println(e.getMessage());
					}
					t.checkPrice(price);
					t.m.put(Key++, new Collection(UUID.randomUUID().toString(), name, price));
					System.out.println("Collection Added Sucessfully...");
					break;
				case 2:
					java.util.Collection<Collection> coll =t.m.values();
					Iterator<Collection> i =coll.iterator();
					while(i.hasNext())
					{
						Collection c =i.next();
						System.out.println(i);
					}
					break;
				case 3:
					System.out.print("Enter Collection id: ");
					int CId=sc.nextInt();
					Collection c =t.m.get(CId);
					if(c==null)
					{
						System.out.println("No Collection Found With The Id :"+CId);
					}
					else 
					{
						System.out.println("Collection Found\n"+ c);
						
					}
					break;
				case 4:
					System.out.print("Enter Collection id: ");
					CId=sc.nextInt();
					c =t.m.get(CId);
					if(c==null)
					{
						System.out.println("No Collection Found With The Id :"+CId);
					}
					else 
					{
						t.m.remove(CId);
						System.out.println("Removed Succesfully..");
						
					}
					break;
				
				case 0:
					System.out.println(t.m);
					System.out.println("Exit from System...");
				    System.exit(0);
				    break;
				default:
					System.out.println("Invaild Choice Try Again");
					break; 
					}
			}catch(InputMismatchException e) {
						System.err.println("Input Mismatch");
					}
			}while(Choice!=0);
			
		}
	}
	