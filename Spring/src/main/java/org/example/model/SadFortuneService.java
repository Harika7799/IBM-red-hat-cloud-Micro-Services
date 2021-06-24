package org.example.model;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Today IS UR UnLucky Day";
	}

}
