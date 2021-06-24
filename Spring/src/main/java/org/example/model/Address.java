package org.example.model;

public class Address {
	
	private String A_Line1;
	private String A_Line2;
	private String City;
	private Integer Zip;
	
	public Address(String a_Line1, String a_Line2, String city, Integer zip) {
		super();
		this.A_Line1 = a_Line1;
		this.A_Line2 = a_Line2;
		this.City = city;
		this.Zip = zip;
	}

	public String getA_Line1() {
		return A_Line1;
	}

	public void setA_Line1(String a_Line1) {
		A_Line1 = a_Line1;
	}

	public String getA_Line2() {
		return A_Line2;
	}

	public void setA_Line2(String a_Line2) {
		A_Line2 = a_Line2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Integer getZip() {
		return Zip;
	}

	public void setZip(Integer zip) {
		Zip = zip;
	}

	@Override
	public String toString() {
		return "Address [A_Line1=" + A_Line1 + ", A_Line2=" + A_Line2 + ", City=" + City + ", Zip=" + Zip + "]";
	}
	
	

}
