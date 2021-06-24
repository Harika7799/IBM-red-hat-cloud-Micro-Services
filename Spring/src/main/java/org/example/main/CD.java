package org.example.main;

public class CD {
	
	private String CdId;
	private String CdName;
	
	public CD(String cdId, String cdName) {
		super();
		this.CdId = cdId;
		this.CdName = cdName;
	}

	public String getCdId() {
		return CdId;
	}

	public void setCdId(String cdId) {
		CdId = cdId;
	}

	public String getCdName() {
		return CdName;
	}

	public void setCdName(String cdName) {
		CdName = cdName;
	}

	@Override
	public String toString() {
		return "CD [CdId=" + CdId + ", CdName=" + CdName + "]";
	}
	
	
}
