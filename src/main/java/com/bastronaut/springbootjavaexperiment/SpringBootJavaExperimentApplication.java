package com.bastronaut.springbootjavaexperiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// annotation already applies @ComponentScan, @EnableAutoConfiguration, @Configuration
@SpringBootApplication
public class SpringBootJavaExperimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavaExperimentApplication.class, args);
	}
}
