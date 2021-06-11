package comm.example;

public class BankD {
	private int CId;
	private String CName;
	private String EmailId;
	
	public BankD(int cId, String cName, String emailId) {
		super();
		CId = cId;
		CName = cName;
		EmailId = emailId;
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
	


	
	

}
