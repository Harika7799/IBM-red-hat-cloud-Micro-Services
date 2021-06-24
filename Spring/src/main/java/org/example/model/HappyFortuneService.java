package org.example.model;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
			return "Today IS UR Lucky Day";
	}

}
