package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class HelloWorldServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServicesApplication.class, args);
	}

}
