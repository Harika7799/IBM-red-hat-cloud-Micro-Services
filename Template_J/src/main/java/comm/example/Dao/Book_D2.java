package comm.example.Dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import comm.example.temp.Book;
@Repository
public class Book_D2 implements Book_D1{
	
	private JdbcTemplate jdbcTemplate;

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
		
		List<Book> books=jdbcTemplate.query("select * from book", new BeanPropertyRowMapper<Book>(Book.class));
		return books;
	}

}
