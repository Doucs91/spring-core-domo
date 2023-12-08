package io.monkeybread.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("In constructer: " + getClass().getSimpleName());
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff in: " + getClass().getSimpleName());
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("doMyCleanupStuff in: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

}
