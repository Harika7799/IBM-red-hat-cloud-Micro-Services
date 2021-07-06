package com.example.Dao;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Book;

public class Book_D2 implements Book_D1 {
	private Map<Integer, Book> bookMap;
	@Autowired
	public Book_D2(Map<Integer, Book> bookMap) {
		this.bookMap = bookMap;
		bookMap.put(new Random().nextInt(), new Book(UUID.randomUUID().toString(), "Node JS", 20.9));
		bookMap.put(new Random().nextInt(), new Book(UUID.randomUUID().toString(), "ReactJS", 29.9));
		bookMap.put(new Random().nextInt(), new Book(UUID.randomUUID().toString(), "Angular JS", 29.7));
		bookMap.put(new Random().nextInt(), new Book(UUID.randomUUID().toString(), "Pro Spring", 30.8));
		bookMap.put(new Random().nextInt(), new Book(UUID.randomUUID().toString(), "Pro Java", 23.8));
	}



	@Override
	public Collection<Book> displayAllBook() {
		System.out.println(bookMap);
		return bookMap.values();
	}

}
