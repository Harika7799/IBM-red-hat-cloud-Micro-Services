package com.example.Dao;

import java.util.Collection;

import com.example.demo.model.Book;

public interface Book_D1 {
	public Book createBook(Book book);
	public Collection<Book> displayAllBook();
	public Book findById(Integer id);

}
