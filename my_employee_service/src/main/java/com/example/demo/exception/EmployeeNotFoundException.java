package com.example.demo.exception;

import lombok.Getter;


@Getter
public class EmployeeNotFoundException extends RuntimeException{
	

private static final long serialVersionUID = -7534323676853843183L;
	
	private String message;
	
public EmployeeNotFoundException(String message) {
		
		this.message = message;
	}

}
