package com.example.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.service.Book_S1;

@RestController
public class Book_C {

private Book_S1 book_S2;

@Autowired
public Book_C(Book_S1 book_S2) {
	this.book_S2 = book_S2;
}
@GetMapping("/api/books")
public ResponseEntity<Collection<Book>> displayAllBook()
{
	return ResponseEntity.status(HttpStatus.OK).body(book_S2.displayAllBook());
}
@PostMapping("/api/books")
public ResponseEntity<Book> createBook(@RequestBody Book book)
{
	return ResponseEntity.status(HttpStatus.CREATED).body(book_S2.createBook(book));
}



}
