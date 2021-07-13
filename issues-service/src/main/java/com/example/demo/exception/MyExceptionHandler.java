package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<IssueErrorResponseModel> handleIssueNotFoundException(IssueNotFoundException e)
	{
		IssueErrorResponseModel response=new IssueErrorResponseModel();
		response.setErrormessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<IssueErrorResponseModel>(response,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<IssueErrorResponseModel> handleGenericException(Exception e)
	{
		IssueErrorResponseModel response=new IssueErrorResponseModel();
		response.setErrormessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<IssueErrorResponseModel>(response,HttpStatus.NOT_FOUND);
	}
}