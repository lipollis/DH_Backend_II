package com.example.dhgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DhGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhGatewayApplication.class, args);
	}

}
