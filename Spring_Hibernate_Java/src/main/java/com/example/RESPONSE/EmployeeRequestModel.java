package com.example.RESPONSE;

public class EmployeeRequestModel {
	
	
	private String First_Name;
	private String Last_Name;
	private String Email;
	
	public EmployeeRequestModel() {
		super();
	}public EmployeeRequestModel(String first_Name, String last_Name, String email) {
		super();
		this.First_Name = first_Name;
		this.Last_Name = last_Name;
		this.Email = email;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "EmployeeRequestModel [First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email + "]";
	}

	
	

}
