package org.example.model;

public class SpecialEditionCD extends CD{
	
	private Integer cdId;
	private String cdName;
	private String specialFeature;
	
	public SpecialEditionCD(Integer cdId, String cdName, String specialFeature) {
		super();
		this.cdId = cdId;
		this.cdName = cdName;
		this.specialFeature = specialFeature;
	}


	
	public Integer getCdId() {
		return cdId;
	}


	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}


	public String getCdName() {
		return cdName;
	}


	public void setCdName(String cdName) {
		this.cdName = cdName;
	}


	public String getSpecialFeature() {
		return specialFeature;
	}


	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}
	@Override
	public String getDetails() {
		
		return "CD ID" + cdId + " CD Name: " + cdName + " CD Special feature: " + specialFeature;
	}


}
