package io.monkeybread.spring.core.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.monkeybread.model.Coach;

@RestController
public class DemoController {

	/*
	 * FIELED INJECTION Pas recommendee car rend le code difficile a unit tester
	 * 
	 * @Autowired private Coach coach;
	 */

	private Coach coach;

	/*
	 * CONSTRUCTER INJECTION
	 */
	@Autowired // OPtionnel si on a qu'une seulle dependance
	public DemoController(Coach coach) {
		this.coach = coach;
	}

	/*
	 * SETTER INJECTION
	 */
//	@Autowired
//	public void setCoach(Coach coach) {
//		this.coach = coach;
//	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return coach.getDailyWorkout();
	}
}
