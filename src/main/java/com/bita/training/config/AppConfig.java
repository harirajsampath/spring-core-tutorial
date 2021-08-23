package com.bita.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.bita.training.model.Employee;

@Configuration
@PropertySource("classpath:com/bita/training/application.properties")
public class AppConfig {

	@Autowired private Employee emp;
	
	@Value("${app.name}")
	private String appName;
	
	@Bean
	@Primary
	@Scope("singleton")
	@Qualifier("john")
	public Employee getJohn() {
		Employee john = new Employee("John", "doe", 28, null);
		return john;
	}
	
	@Bean
	@Qualifier("mary")
	public Employee getMary() {
		Employee john = new Employee("Mary", "doe", 28, null);
		return john;
	}
	
	public String getAppName() {
		return this.appName;
	}
	
//	public Employee getEmployee() {
//		return this.emp;
//	}
}
