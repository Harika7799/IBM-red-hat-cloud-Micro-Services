package org.example.Repository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.example.Book.Book;

public interface Book_R1 {
	
public Book createBook(Book book);
public List<Book> getAllBook();
public Book findBookById(Integer id);
public Book UpdateBookById(Integer id)throws IOException;
public void DeleteBookById(Integer id);	

}
