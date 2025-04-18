package com.example.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@SpringBootApplication
@RestController
public class ServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}

	private final Set<String> names = Set.of("Alice", "Bob", "Charlie");
	@GetMapping("/name")
	public String name() {
		return names.stream()
				.skip((int) (Math.random() * names.size()))
				.findFirst()
				.orElse("Unknown");
	}

}
