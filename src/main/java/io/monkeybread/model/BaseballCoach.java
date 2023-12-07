package io.monkeybread.model;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println("In constructer: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting pactice";
	}

}
