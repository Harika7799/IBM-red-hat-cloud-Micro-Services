package org.example.main;

public class IntenationalCD extends CD implements MyInterface{
	private String internationalID;

	public IntenationalCD(String cdId, String cdName,String internationalID) {
		super(cdId, cdName);
		this.internationalID=internationalID;
	}

	
	public String getInternationalID() {
		return internationalID;
	}

	public void setInternationalID(String internationalID) {
		this.internationalID = internationalID;
	}


	@Override
	public String getDetails() {
		
		return "ID:"+ getCdId()+"NAME:"+getCdName()+"International-ID:"+internationalID;
	}
	


}
