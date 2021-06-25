package org.example.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("${address.A_Line1}")
	private String A_Line1;
	@Value("${address.A_Line2}")
	private String A_Line2;
	
	public Address() {
		super();
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

	@Override
	public String toString() {
		return "Address [A_Line1=" + A_Line1 + ", A_Line2=" + A_Line2 + "]";
	}
	

}
