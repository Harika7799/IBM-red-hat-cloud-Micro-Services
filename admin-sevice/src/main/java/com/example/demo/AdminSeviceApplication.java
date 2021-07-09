package com.example.demo;

import org.springframework.boot.SpringApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminSeviceApplication.class, args);
	}

}
