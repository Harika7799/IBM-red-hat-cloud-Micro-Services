package org.example.model;

public class SwimmingCoach implements Coach {
	
	private FortuneService fs;
	
	public SwimmingCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}

	@Override
	public String getDailyworkOut() {
	
		return "practice back swimming today";
	}

	
	@Override
	public String getDailyFortune() {
	
		return fs.getDailyFortune();
	}

}
