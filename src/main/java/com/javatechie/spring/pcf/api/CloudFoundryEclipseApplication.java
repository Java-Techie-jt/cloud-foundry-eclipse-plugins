package com.javatechie.spring.pcf.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudFoundryEclipseApplication {
	
	
	@GetMapping("/")
	public String message() {
		return "Application deployed successfully....!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudFoundryEclipseApplication.class, args);
	}

}
