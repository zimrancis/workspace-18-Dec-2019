package com.ciphersnippet.peofileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.ciphersnippet.rentcloud.model")
public class PeofileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeofileServiceApplication.class, args);
	}

}
