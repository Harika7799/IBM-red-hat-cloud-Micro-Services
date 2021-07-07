package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

@Service
public class BookServiceImpl implements BookService {

private BookDao bookDao;
	
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public Book createBook(Book book) {
	
		book.setBookId(UUID.randomUUID().toString());
		return bookDao.createBook(book);
	}

	@Override
	public List<Book> getAllBook() {
		
		return bookDao.getAllBook();
	}

	@Override
	public Book getBookById(Integer id) {
		
		return bookDao.getBookById(id);
	}

	@Override
	public Book getByBookId(String id) {
		return bookDao.getByBookId(id);
	}

	@Override
	public Book updateBookByBookId(String bookId, Book book) {
		
		return bookDao.updateBookByBookId(bookId, book);
	}

	@Override
	public String deleteByBookId(String bookId) {
		
		return bookDao.deleteByBookId(bookId);
	}
}
