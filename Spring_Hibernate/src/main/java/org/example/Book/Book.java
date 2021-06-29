package org.example.Book;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
	
	
	@Id
	@Column(name = "book_id")
	private Integer book_Id;
	@Column(name = "book_name")
	private String book_Name;
	@Column(name = "book_price")
	private Double book_Price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int nextInt, String book_Name2, Double book_Price2) {
		// TODO Auto-generated constructor stub
	}
	public Integer getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(Integer book_Id) {
		this.book_Id = book_Id;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public Double getBook_Price() {
		return book_Price;
	}
	public void setBook_Price(Double book_Price) {
		this.book_Price = book_Price;
	}
	
	

}
