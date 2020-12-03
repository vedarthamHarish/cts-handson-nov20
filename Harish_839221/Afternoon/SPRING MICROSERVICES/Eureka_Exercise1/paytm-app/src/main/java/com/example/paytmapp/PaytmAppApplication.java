package com.example.paytmapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaytmAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmAppApplication.class, args);
	}

}
