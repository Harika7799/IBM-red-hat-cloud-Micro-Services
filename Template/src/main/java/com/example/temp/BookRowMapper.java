package com.example.temp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book=new Book();
		book.setBook_Id(rs.getInt(1));
		book.setBook_Name(rs.getString(2));
		book.setBook_Price(rs.getDouble(3));
		return book;
	}

}
