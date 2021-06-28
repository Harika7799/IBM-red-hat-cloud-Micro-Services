package com.example.temp;

public class Book {

	private Integer book_Id;
	private String book_Name;
	private Double book_Price;
	
	public Book() {
		super();
	}
	public Book(Integer book_Id, String book_Name, Double book_Price) {
		super();
		this.book_Id = book_Id;
		this.book_Name = book_Name;
		this.book_Price = book_Price;
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

	@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", book_Name=" + book_Name + ", book_Price=" + book_Price + "]";
	}

      public void displayBook() {


		System.out.println(book_Id+"\t"+book_Name+"\t"+book_Price);
		System.out.println("\n");
	}
	
	
}
