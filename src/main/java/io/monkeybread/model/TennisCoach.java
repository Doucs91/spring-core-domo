package io.monkeybread.model;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	public TennisCoach() {
		System.out.println("In constructer: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
