package comm.example.Service;

import java.sql.SQLException;
import java.util.List;

import comm.example.temp.Book;

public interface Book_S1 {
	public Book createBook(Book book) throws SQLException;
	public List<Book> displayAllBook() throws SQLException;

}
