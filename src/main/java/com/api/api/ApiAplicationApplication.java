package com.api.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiAplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAplicationApplication.class, args);
	}

	@Bean
	ModelMapper modelMappermapper(){
		return new ModelMapper();
	}
}
