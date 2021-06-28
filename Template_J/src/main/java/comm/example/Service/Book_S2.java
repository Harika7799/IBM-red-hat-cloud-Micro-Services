package comm.example.Service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.Dao.Book_D1;
import comm.example.temp.Book;
@Service
public class Book_S2 implements Book_S1{
	
	private Book_D1 book_D2;
	@Autowired
	public Book_S2(Book_D1 book_D2) {
		
		this.book_D2 = book_D2;
	}


	@Override
	public Book createBook(Book book) throws SQLException {
		
		return book_D2.createBook(book);
	}

	@Override
	public List<Book> displayAllBook() throws SQLException {
		
		return book_D2.displayAllBook();
	}

}
