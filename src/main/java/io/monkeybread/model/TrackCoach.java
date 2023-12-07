package io.monkeybread.model;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5 KM!";
	}

}