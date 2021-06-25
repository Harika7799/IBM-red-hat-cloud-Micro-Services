package org.example.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
	
	private FortuneService happyFortuneService;
	
	@Autowired
	public BaseBallCoach(FortuneService happyFortuneService) {
		super();
		this.happyFortuneService = happyFortuneService;
	}

	@Override
	public String getDailyworkOut() {
	
		return "practice back volley today";
	}

	@Override
	public String getDailyFortune() {
	
		return happyFortuneService.getDailyFortune() ;
	}

}
