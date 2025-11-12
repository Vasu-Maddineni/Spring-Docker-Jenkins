package com.Spring_Docker_Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerJenkinsApplication {
	
	@GetMapping
	public String home() {
		return "Welcome to Jenkins automatic build !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerJenkinsApplication.class, args);
	}

}
