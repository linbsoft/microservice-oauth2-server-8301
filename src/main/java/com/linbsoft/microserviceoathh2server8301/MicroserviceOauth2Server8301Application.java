package com.linbsoft.microserviceoathh2server8301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceOauth2Server8301Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOauth2Server8301Application.class, args);
	}
}

