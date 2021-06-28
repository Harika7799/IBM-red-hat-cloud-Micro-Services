package com.example.Dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Template.BookNotFoundException;
import com.example.temp.Book;
import com.example.temp.BookRowMapper;
@Repository
public class Book_D2 implements Book_D1 {
	
	private JdbcTemplate jdbcTemplate;
	BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

	@Autowired
	public Book_D2(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Book createBook(Book book) throws SQLException {
		int count=jdbcTemplate.update("insert into book(book_id,book_name,book_price) values(?,?,?)",book.getBook_Id(),book.getBook_Name(),book.getBook_Price());
		System.out.format("%d rows inserted",count);
		return book;
	}

	@Override
	public List<Book> displayAllBook() throws SQLException {
      //List<Book> books=jdbcTemplate.query("select * from book", new BeanPropertyRowMapper<Book>(Book.class));
		
		List<Book> books=jdbcTemplate.query("select * from book", new BookRowMapper());
		return books;
	}
	

	@Override
	public List<Book> findBookById(Integer id) throws SQLException {
		List<Book> list=jdbcTemplate.query("select * from book where book_id='"+id+"'",new BookRowMapper());
		return list;
	}

	@Override
	public Book UpdateBookById(Integer id) throws BookNotFoundException, NumberFormatException, IOException {
		List<Book> list=jdbcTemplate.query("select * from book where book_id='"+id+"'",new BookRowMapper());
		Book book =null;
		if(list.isEmpty())
			throw new BookNotFoundException("Book was Not Found with this Id..");
		else {
			Iterator<Book> i=list.iterator();
			while(i.hasNext()) {
				book =i.next();
			}
			System.out.println("Enter the Book name");
			String new_Name= bf.readLine();
			System.out.println("Enter the Book price");
			Double new_Price =Double.parseDouble(bf.readLine());
			book.setBook_Name(new_Name);
			book.setBook_Price(new_Price);
			int count =jdbcTemplate.update("upadate book set book_Name= ? wehere book_Id =?",book.getBook_Name(),book.getBook_Price(),book.getBook_Id());
			System.out.format("%d rows updated",count);
		}
			return book;

	}

	@Override
	public void DeleteBookById(Integer id) throws BookNotFoundException{
		List<Book> list=jdbcTemplate.query("select * from book where book_id='"+id+"'",new BookRowMapper());
	
		if(list.isEmpty())
			throw new BookNotFoundException("Book was Not Found with this Id..");
		else {
			Book book=list.get(0);
			int count =jdbcTemplate.update("delete from where book_Id =?",book.getBook_Id());
			System.out.format("%d rows deleted", count);
		}
		
	}

}
