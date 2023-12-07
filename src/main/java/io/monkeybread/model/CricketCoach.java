package io.monkeybread.model;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("In constructer: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

}
