package com.example.demo.exception;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class IssueErrorResponseModel {
	private String errormessage;
	private Integer statusCode;


}
