package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Dao.Book_D1;
import com.example.demo.model.Book;

public class Book_S2 implements Book_S1{
	
	
	private Book_D1 book_D2;
	
	@Autowired
	public Book_S2(Book_D1 book_D2) {
		this.book_D2 = book_D2;
	}


	@Override
	public Collection<Book> displayAllBook() {
		
		return book_D2.displayAllBook();
	}

}
