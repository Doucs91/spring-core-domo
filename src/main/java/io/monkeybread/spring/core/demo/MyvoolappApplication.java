package io.monkeybread.spring.core.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Dans le cas ou il y a des componeents qui ne sont pas dans les subpage du package de base
 * on ajoute explicitement les packages a scanner dans  scanBasePackages
 */
@SpringBootApplication(scanBasePackages = { "io.monkeybread.spring.core.demo", "io.monkeybread.model" })

public class MyvoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyvoolappApplication.class, args);
	}

}
