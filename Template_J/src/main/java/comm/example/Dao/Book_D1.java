package comm.example.Dao;

import java.sql.SQLException;
import java.util.List;

import comm.example.temp.Book;

public interface Book_D1 {
//public Connection getMyConnection() throws SQLException;
	
	public Book createBook(Book book) throws SQLException;
	
	public List<Book> displayAllBook() throws SQLException;


}
