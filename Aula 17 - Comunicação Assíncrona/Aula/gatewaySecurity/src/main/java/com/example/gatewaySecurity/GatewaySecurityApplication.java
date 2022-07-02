package com.example.gatewaySecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GatewaySecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySecurityApplication.class, args);
	}

}
