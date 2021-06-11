package comm.example;

public class Customer {
	
	private int CId;
	private String CName;
	private String EmailId;
	public Customer() {
		super();
	}
	public Customer(int cId, String cName, String emailId) {
		super();
		this.CId = cId;
		this.CName = cName;
		this.EmailId = emailId;
	}
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	@Override
	public String toString() {
		return "Customer [CId=" + CId + ", CName=" + CName + ", EmailId=" + EmailId + "]";
	}
	
	

}
