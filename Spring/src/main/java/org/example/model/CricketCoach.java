package org.example.model;

public class CricketCoach implements Coach{
	
	private FortuneService fs;

	/*public FortuneService getFs() {
		return fs;
	}*/
	
	//setter injection
		public void setFortuneService(FortuneService fortuneService) {
			this.fs = fortuneService;
		}
	
	@Override
	public String getDailyworkOut() {
		
		return "practice batting today";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getDailyFortune();
	}

	

}
