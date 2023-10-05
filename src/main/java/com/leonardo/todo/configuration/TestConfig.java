package com.leonardo.todo.configuration;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardo.todo.services.DBService;

@Configuration
@Profile("teste")
public class TestConfig {
	@Autowired
	private DBService dbService;

	@Bean
	 boolean instanciar() throws ParseException {
		this.dbService.instanciarBaseDeDados();
		return true;
	}
}
