package org.example.coach;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
			return "Today IS UR Lucky Day";
	}

}
