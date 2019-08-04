package com.li.reading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker //启用熔断器
public class ReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingApplication.class, args);
	}

}
