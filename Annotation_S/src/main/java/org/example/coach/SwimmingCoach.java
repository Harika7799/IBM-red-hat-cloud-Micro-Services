package org.example.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {
	
	private FortuneService sadFortuneService;
	
	@Autowired
	public SwimmingCoach(FortuneService sadFortuneService) {
		super();
		this.sadFortuneService = sadFortuneService;
	}

	@Override
	public String getDailyworkOut() {
	
		return "practice back swimming today";
	}

	
	@Override
	public String getDailyFortune() {
	
		return sadFortuneService.getDailyFortune();
	}

}
