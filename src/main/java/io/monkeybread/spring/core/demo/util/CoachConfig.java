package io.monkeybread.spring.core.demo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.monkeybread.model.Coach;
import io.monkeybread.model.SwimCoach;

@Configuration
public class CoachConfig {
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
