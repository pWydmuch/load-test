package com.example.servicea;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@AllArgsConstructor
public class ServiceAApplication {

	private final ServiceBClient serviceBClient;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet(){
		String name = serviceBClient.name();
		return "Hey " + name;
	}

}
