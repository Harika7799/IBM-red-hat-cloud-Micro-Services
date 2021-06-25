package org.example.Account;

public class Account {
	
	private Integer Id;
	private String A_Id;
	private String A_HolderName;
	private double A_Balance;
	
	public Account() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getA_Id() {
		return A_Id;
	}

	public void setA_Id(String a_Id) {
		A_Id = a_Id;
	}

	public String getA_HolderName() {
		return A_HolderName;
	}

	public void setA_HolderName(String a_HolderName) {
		A_HolderName = a_HolderName;
	}

	public double getA_Balance() {
		return A_Balance;
	}

	public void setA_Balance(double a_Balance) {
		A_Balance = a_Balance;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", A_Id=" + A_Id + ", A_HolderName=" + A_HolderName + ", A_Balance=" + A_Balance
				+ "]";
	}
	
	
	

}
