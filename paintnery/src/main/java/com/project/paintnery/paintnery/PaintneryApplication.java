package com.project.paintnery.paintnery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.project.paintnery.paintnery")
public class PaintneryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaintneryApplication.class, args);
	}

}
