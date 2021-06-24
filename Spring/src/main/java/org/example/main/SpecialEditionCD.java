package org.example.main;

public class SpecialEditionCD extends CD implements MyInterface {
	
	private String SpecialEditionID;

	public SpecialEditionCD(String cdId, String cdName, String specialEditionID) {
		super(cdId, cdName);
		SpecialEditionID = specialEditionID;
	}


	public String getSpecialEditionID() {
		return SpecialEditionID;
	}


	public void setSpecialEditionID(String specialEditionID) {
		SpecialEditionID = specialEditionID;
	}
	@Override
	public String getDetails() {
		
		return "ID:"+ getCdId()+"NAME:"+getCdName()+"SpecialEdition_ID"+ SpecialEditionID;
	}



}
