package com.leonardo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardo.cursomc.services.DBService;
import com.leonardo.cursomc.services.EmailService;
import com.leonardo.cursomc.services.MockEmailService;


@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instatiateDatabase() throws ParseException {
		dbService.intantiateTestDatabase();
		return true; 
	}
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
