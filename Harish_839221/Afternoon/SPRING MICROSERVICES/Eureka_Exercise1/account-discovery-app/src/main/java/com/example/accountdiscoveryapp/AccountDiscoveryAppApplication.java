package com.example.accountdiscoveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountDiscoveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountDiscoveryAppApplication.class, args);
	}

}
