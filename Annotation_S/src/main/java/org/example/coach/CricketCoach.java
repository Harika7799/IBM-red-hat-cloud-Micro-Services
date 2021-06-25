package org.example.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	private FortuneService happyFortuneService;

	@Value("${coach.team}")
	private String team;
	
	public CricketCoach(FortuneService happyFortuneService) {
		super();
		this.happyFortuneService = happyFortuneService;
	}

	
	/*private FortuneService fs;

	public FortuneService getFs() {
		return fs;
	}
	
	//setter injection
		public void setFortuneService(FortuneService fortuneService) {
			this.fs = fortuneService;
		}*/
	
	@Override
	public String getDailyworkOut() {
		
		return "practice batting today"+team;
	}

	@Override
	public String getDailyFortune() {
		
		return happyFortuneService.getDailyFortune();
	}

	

}
