package com.li.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumersApplication.class, args);
	}

}
