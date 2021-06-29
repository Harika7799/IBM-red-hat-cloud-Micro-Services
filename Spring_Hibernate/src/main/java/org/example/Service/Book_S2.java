package org.example.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.example.Book.Book;
import org.example.Repository.Book_R1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book_S2 implements Book_S1{
	
	private Book_R1 book_R2;
	
	@Autowired
	public Book_S2(Book_R1 book_R2) {
		
		this.book_R2 = book_R2;
	}


	@Override
	public Book createBook(Book book) {
		
		return book_R2.createBook(book);
	}

	@Override
	public List<Book> getAllBook() {
		
		return book_R2.getAllBook();
	}

	@Override
	public Book findBookById(Integer id) {
		
		return book_R2.findBookById(id);
	}

	@Override
	public Book UpdateBookById(Integer id) throws NumberFormatException, IOException {
		
		return book_R2.UpdateBookById(id);
	}

	@Override
	public void DeleteBookById(Integer id) {
		
		book_R2.DeleteBookById(id);
	}

}
