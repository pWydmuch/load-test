package com.example.loadtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoadTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadTestApplication.class, args);
	}

	@GetMapping("/test")
	public void doSth(){
	}

	@GetMapping("/greet")
	public String  greet(){
		return "Hi from k8s";
	}

}
