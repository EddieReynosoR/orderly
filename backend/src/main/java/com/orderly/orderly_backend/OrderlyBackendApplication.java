package com.orderly.orderly_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OrderlyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderlyBackendApplication.class, args);
	}

}
