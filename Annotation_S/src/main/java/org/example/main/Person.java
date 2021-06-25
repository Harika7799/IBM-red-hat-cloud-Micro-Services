package org.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value ="prototype")
public class Person {
	
	@Value("1201")
	private Integer P_Id;
	@Value("Honey")
	private String First_Name;
	@Value("Well")
	private String Last_Name;
	@Value("honey@email.com")
	private String Email;
	@Value("${person.team}")
	private String team;
	@Value("${person.country}")
	private String country;
	private Address address;
	
	public Person() {
		super();
	}
	
	@Autowired
	public Person(Address address) {
		super();
		this.address = address;
	}

	public Integer getP_Id() {
		return P_Id;
	}

	public void setP_Id(Integer p_Id) {
		P_Id = p_Id;
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

	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Person [P_Id=" + P_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email
				+ ", team=" + team + ", country=" + country + ", address=" + address + "]";
	}


}
