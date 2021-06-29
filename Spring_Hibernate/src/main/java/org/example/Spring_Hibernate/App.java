package org.example.Spring_Hibernate;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

import org.example.Book.Book;
import org.example.Repository.Book_R1;
import org.example.Repository.Book_R2;
import org.example.Service.Book_S1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
try {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        	Book_S1 bookReporitory=context.getBean("book_S2",Book_S1.class);
        	int x= -1;
        	do {
				System.out.println("1.Add A New Book");
				System.out.println("2.Display All Book");
				System.out.println("3. Find Book By ID");
				System.out.println("0: Exit");
				System.out.print("your choice: ");
				x = Integer.parseInt(bufferedReader.readLine());
				switch (x) {
				
				case 1:
				System.out.print("Book Name: ");
				String book_Name = bufferedReader.readLine();
				System.out.println("Book Price: ");
				Double book_Price = Double.parseDouble(bufferedReader.readLine());
				Book book =bookReporitory.createBook(new Book(new Random().nextInt(1000),book_Name, book_Price));
				System.out.println(book);
				break;
				
				case 2:	
        	//Book book=bookReporitory.createBook(new Book(new Random().nextInt(100000), "Pro Node", 110.0));
        	//System.out.println(book);
        	List<Book> list=bookReporitory.getAllBook();
        	for(Book b:list)
        	{
        		System.out.println(b);
        	}
        	break;
				case 3:
					try {
						
					System.out.println("Enter Book Id:");
					int id =Integer.parseInt(bufferedReader.readLine());
					Book book1=bookReporitory.findBookById(id);
					if(book1 ==null)
						throw new BookNotFoundException("Book with that id not Found");
					else
					{
						System.out.println(book1);
					}
						
					}catch(BookNotFoundException e)
					{
						System.err.println("Book Not Found....");
					}
					break;
					
				case 4:
					try {
					System.out.println("Enter Book Id:");
					int id =Integer.parseInt(bufferedReader.readLine());
					Book book2=bookReporitory.findBookById(id);
					if(book2 ==null)
						throw new BookNotFoundException("Book with that id not Found");
					else
					{
						Book b3 =bookReporitory.UpdateBookById(id);
						System.out.println("Upadate book successfully..");
						System.out.println(b3);
					}
					}catch(BookNotFoundException e)
					{
						System.err.println("Book Not Found....");
					}
					break;
				case 5:
					try {
						System.out.println("Enter Book Id:");
						int id =Integer.parseInt(bufferedReader.readLine());
						Book book2=bookReporitory.findBookById(id);
						if(book2 ==null)
							throw new BookNotFoundException("Book with that id not Found");
						else
						{
							bookReporitory.DeleteBookById(id);
						}
					}catch(BookNotFoundException e)
					{
						System.err.println("Book Not Found....");
					}
					break;
				default:
					System.out.println("Enter ur Valid Choice");
					break;
				}
				}while(x!=0);
				
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    }

