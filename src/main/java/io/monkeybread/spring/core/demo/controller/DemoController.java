package io.monkeybread.spring.core.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.monkeybread.spring.core.demo.models.Coach;

@RestController
public class DemoController {

	private Coach coach;

	@Autowired //OPtionnel si on a qu'une seulle dependance
	public DemoController(Coach coach) {
		this.coach = coach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return coach.getDailyWorkout();
	}
}
