package org.example.collection;

public class Collection {
	private String CId;
	private String CName;
	private double Cprice;
	
	public Collection() {
		super();
	}
	public Collection(String cId, String cName, double cprice) {
		super();
		this.CId = cId;
		this.CName = cName;
		this.Cprice = cprice;
	}
	public String getCId() {
		return CId;
	}
	public void setCId(String cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public double getCprice() {
		return Cprice;
	}
	public void setCprice(double cprice) {
		Cprice = cprice;
	}
	@Override
	public String toString() {
		return "Collection [CId=" + CId + ", CName=" + CName + ", Cprice=" + Cprice + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Collection c=null;
		if(obj instanceof Collection)
		{
			c=(Collection)obj;
		}
		if((this.CName== c.CName)&&(this.Cprice==c.Cprice))
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
	

	
}
