package com.example.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.example.Template.BookNotFoundException;
import com.example.temp.Book;

public interface Book_D1 {
	//public Connection getMyConnection() throws SQLException;
	
		public Book createBook(Book book) throws SQLException;
		
		public List<Book> displayAllBook() throws SQLException;
		
		public List<Book> findBookById(Integer id)throws SQLException;
		public Book UpdateBookById(Integer id)throws BookNotFoundException, NumberFormatException, IOException;
		public void DeleteBookById(Integer id)throws BookNotFoundException;	

}