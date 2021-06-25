package org.example.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

import org.example.Account.Account;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class My_Config {
	
	@Bean
	public ArrayList<Account> list()
	{
		return new ArrayList<Account>();
	}
	
	

}
