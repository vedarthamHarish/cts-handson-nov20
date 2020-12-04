package com.example.restbasedspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.controller","com.example.model","com.example.service"})
public class RestBasedSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBasedSpringBootApplication.class, args);
	}

}
