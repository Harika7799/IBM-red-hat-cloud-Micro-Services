package org.example.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import org.example.Book.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


@Repository
@EnableTransactionManagement
public class Book_R2 implements Book_R1 {
	
	private SessionFactory sf;
	BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
	
	@Autowired
	public Book_R2(SessionFactory sf) {
		super();
		this.sf = sf;
	}


	@Override
	@Transactional
	public Book createBook(Book book) {
		
		Session s1 =sf.getCurrentSession();
		s1.persist(book);
		return book;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() {
		Session current_S =sf.openSession();
		Query qu =current_S.createQuery("select B from Book B", Book.class);
		
		return qu.getResultList();
	}


	@Override
	public Book findBookById(Integer id) {
		Session current_S =sf.openSession();
		return current_S.get(Book.class,id);
	}


	@Override
	@Transactional
	public Book UpdateBookById(Integer id) throws IOException {
		Session current_S =sf.getCurrentSession();
		Book book = new Book();
		System.out.println("Enter the Book name");
		String new_Name= bf.readLine();
		System.out.println("Enter the Book price");
		Double new_Price =Double.parseDouble(bf.readLine());
		book.setBook_Name(new_Name);
		book.setBook_Price(new_Price);
		book.setBook_Id(id);
		current_S.merge(book);
		return book;
	}


	@Override
	public void DeleteBookById(Integer id) {
		Session current_S =sf.getCurrentSession();
		Book book= current_S.get(Book.class, id);
		current_S.remove(book);
		System.out.println("Deleted Succesfully...");
		
	}

}
