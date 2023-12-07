package io.monkeybread.model;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	public TrackCoach() {
		System.out.println("In constructer: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5 KM!";
	}

}
