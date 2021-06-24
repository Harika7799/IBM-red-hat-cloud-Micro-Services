package org.example.model;

public class Customer {
	
	
	private Integer Customer_Id;
	private String Customer_Name;
	private Address address;
	private Branch branch;
	
	/*public Customer(Integer customer_Id, String customer_Name, Address address) {
		super();
		this.Customer_Id = customer_Id;
		this.Customer_Name = customer_Name;
		this.address = address;
		this.branch =branch;
	}*/

	public Integer getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(Integer customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return Customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [Customer_Id=" + Customer_Id + ", Customer_Name=" + Customer_Name + ", address=" + address
				+ ", branch=" + branch + "]";
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	

}
