package org.example.coach;

import org.springframework.stereotype.Component;

@Component 
public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Today IS UR UnLucky Day";
	}

}
