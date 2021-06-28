package com.example.Template;

public class BookNotFoundException extends RuntimeException {
	
	
	private static final long serialVersionUID = 330534567767267214L;
	private String message;
	
	public BookNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	

}
