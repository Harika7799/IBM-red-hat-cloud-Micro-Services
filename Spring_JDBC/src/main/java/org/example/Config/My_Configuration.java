package org.example.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"org.example"})
public class My_Configuration {
	@Bean
	public DataSource data()
	{
		DriverManagerDataSource data=new DriverManagerDataSource();
		data.setUrl("jdbc:mysql://localhost:3306/hr");
		data.setUsername("root");
		data.setPassword("root");
		return data;

}
}