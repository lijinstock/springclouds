package com.li.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,})
@SpringBootApplication
public class DataMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMysqlApplication.class, args);
	}

}
