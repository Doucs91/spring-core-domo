package io.monkeybread.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("In constructer: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

}
