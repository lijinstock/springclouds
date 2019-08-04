package com.li.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext cd = SpringApplication.run(DataJpaApplication.class, args);
		CustomerRespository cx = (CustomerRespository) cd.getBean("customerRespository");

		Customer c = new Customer();
		c.setFirstName("x");

		c.setLastName("ps");
		cx.save(c);

	}






}
