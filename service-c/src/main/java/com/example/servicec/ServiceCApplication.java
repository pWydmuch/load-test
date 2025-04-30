package com.example.servicec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class ServiceCApplication {
	private static long id = 0;

	public static void main(String[] args) {
		SpringApplication.run(ServiceCApplication.class, args);
	}

	@Bean
	public Supplier<Long> eventSupplier() {
		return () -> id++;
	}
}
