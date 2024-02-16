package com.anarghya.customer.ayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.anarghya.customer.ayur.entity")
public class AnarghyaAyurCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnarghyaAyurCustomerApplication.class, args);
	}

}
