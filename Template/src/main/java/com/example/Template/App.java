package com.example.Template;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Config.My_Config;
import com.example.Service.Book_S1;
import com.example.Service.Book_S2;
import com.example.temp.Book;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int choice = 0;
			String book_Name = null;
			double book_Price = 0.0;
			@SuppressWarnings("resource")
			ApplicationContext context = new AnnotationConfigApplicationContext(My_Config.class);
			Book_S1 service = context.getBean("book_S2", Book_S2.class);
			do {
				System.out.println("1.Add A New Book");
				System.out.println("2.Display All Book");
				System.out.println("3. Find Book By ID");
				System.out.println("0: Exit");
				System.out.print("your choice: ");
				choice = Integer.parseInt(bufferedReader.readLine());
				switch (choice) {
				case 1:
					System.out.print("Book Name: ");
					book_Name = bufferedReader.readLine();
					System.out.println("Book Price: ");
					book_Price = Double.parseDouble(bufferedReader.readLine());
					System.out.println(service.createBook(new Book(new Random().nextInt(1000), book_Name, book_Price)));
					break;
				case 2:
					List<Book> list = service.displayAllBook();
					System.out.println("BOOK_ID\tBOOK_NAME\tBOOK_PRICE\n=================================\n");
					for (Book book : list) {
						book.displayBook();
					}
					break;
               case 3:
					
					try {

						System.out.print("Book Id: ");
						int id = Integer.parseInt(bufferedReader.readLine());
						List<Book> b = service.findBookById(id);
						if (b.isEmpty())
                               throw new BookNotFoundException("book with the given id not found.");
						else
						{
							System.out.println(b);
						}
					}

					catch (BookNotFoundException e) {
						System.err.println(e.getMessage());
					}
					
					
					break;
               case 4:
					System.out.println("Book_Id");
					int Id =Integer.parseInt(bufferedReader.readLine());
					System.out.println(service.UpdateBookById(Id));
					break;
               case 5:
            	   System.out.println("Book_Id");
				   Id =Integer.parseInt(bufferedReader.readLine());
            	   service.DeleteBookById(Id);
                 default:
	               break;
                      
				}

                } while (choice != 0);

               } catch (Exception e) {
                     e.printStackTrace();
                 }

					
    }
				
}
