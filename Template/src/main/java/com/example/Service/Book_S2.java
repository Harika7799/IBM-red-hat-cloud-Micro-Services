package com.example.Service;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.Book_D1;
import com.example.Template.BookNotFoundException;
import com.example.temp.Book;
@Service
public class Book_S2 implements Book_S1 {

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

	@Override
	public List<Book> findBookById(Integer id) throws SQLException {
		
		return book_D2.findBookById(id);
	}


	@Override
	public Book UpdateBookById(Integer id) throws BookNotFoundException, NumberFormatException, IOException {
		
		return book_D2.UpdateBookById(id);
	}


	@Override
	public void DeleteBookById(Integer id) throws BookNotFoundException{
		
		book_D2.DeleteBookById(id);
	}

}
