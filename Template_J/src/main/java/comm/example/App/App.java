package comm.example.App;

/**
 * Hello world!
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comm.example.Service.Book_S1;
import comm.example.Service.Book_S2;
import comm.example.config.MyConfig;
import comm.example.temp.Book;


public class App {

	public static void main(String[] args) {

		try {
			
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			int x=0;
			String book_Name=null;
			double book_Price=0.0;
			@SuppressWarnings("resource")
			ApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
			Book_S1 service=context.getBean("book_S2",Book_S2.class);
			do {
				System.out.println("1.Add A New Book");
				System.out.println("2.Display All Book");
				System.out.println("0: Exit");
				System.out.print("your choice: ");
				x=Integer.parseInt(bufferedReader.readLine());
				switch (x) {
				case 1:
					System.out.print("Book Name: ");
					book_Name=bufferedReader.readLine();
					System.out.println("Book Price: ");
					book_Price=Double.parseDouble(bufferedReader.readLine());
					System.out.println(service.createBook(new Book(new Random().nextInt(1000), book_Name, book_Price)));
					break;
				case 2:
					List<Book> list=service.displayAllBook();
					System.out.println("BOOK_ID\tBOOK_NAME\tBOOK_PRICE\n=================================\n");
					for(Book book:list)
					{
						book.displayBook();
					}
					break;

				default:
					break;
				}
				
			} while (x!=0);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}
}