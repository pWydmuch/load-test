package com.example.serviced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class ServiceDApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDApplication.class, args);
	}

	@Bean
	public Consumer<Long> eventConsumer() {
		return event -> {
			System.out.println("Received event: " + event);
			try {
				Thread.sleep(1000); // Simulate processing time
			} catch (InterruptedException ignored) {}
		};
	}

}
